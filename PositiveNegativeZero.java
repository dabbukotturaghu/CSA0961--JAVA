import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = input.nextDouble();
        if (n > 0) {
            System.out.println(n+ " is positive.");
        } else if (n < 0) {
            System.out.println(n+ " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        input.close();
    }
}
