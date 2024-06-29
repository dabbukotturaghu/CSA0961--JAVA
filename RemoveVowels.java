import java.util.Scanner;

public class RemoveVowels {
    public static void main(String arg []) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = input.replaceAll("[AEIOUaeiou]", "");
        
        System.out.println("The string without vowels is: " + result);
    }
}