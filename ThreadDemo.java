public class ThreadDemo {
    public static void main(String[] args) {

        Thread fibonacciThread = new Thread(new FibonacciTask());
        Thread reverseThread = new Thread(new ReverseCountTask());

        fibonacciThread.start();
        reverseThread.start();
    }

    static class FibonacciTask implements Runnable {

        public void run() {
            System.out.println("Fibonacci series:");
            int n = 10;
            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }

    static class ReverseCountTask implements Runnable {

        public void run() {
            System.out.println("Numbers from 10 to 1 in reverse order:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
