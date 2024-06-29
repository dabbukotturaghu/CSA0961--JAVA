import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        long fact = 1;
        if (n< 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                fact*= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
