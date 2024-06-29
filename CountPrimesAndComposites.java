import java.util.Scanner;

public class CountPrimesAndComposites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numbers (enter any non-integer to finish):");
        
        int primeCount = 0;
        int compositeCount = 0;
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number <= 1) {
                continue; // Skip numbers less than or equal to 1
            }
            
            boolean isPrime = true;
            
            // Check if number is prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        
        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
        
        scanner.close();
    }
}
