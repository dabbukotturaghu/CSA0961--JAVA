class Customer {
    private int balance;

    public Customer(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        notify(); // Notify the waiting threads
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance for withdrawal: " + amount + ", Current Balance: " + balance);
            try {
                wait(); // Wait until deposit() adds enough funds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
    }
}

public class BankOperations {
    public static void main(String[] args) {
        Customer customer = new Customer(10000);

        // Withdraw thread
        new Thread(() -> customer.withdraw(12000)).start();

        // Give some time for the withdraw thread to start and check balance
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }

        // Deposit thread
        new Thread(() -> customer.deposit(3000)).start();
    }
}
