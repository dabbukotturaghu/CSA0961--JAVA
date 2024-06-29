import java.util.Scanner;
public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        double biggest = (a > b) ? a : b;
        System.out.println("The biggest number is: " + biggest);
        input.close();
    }
}
