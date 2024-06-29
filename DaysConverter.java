import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int DAYS_IN_A_YEAR = 365;
        int DAYS_IN_A_WEEK = 7;

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years, weeks, and remaining days
        int years = totalDays / DAYS_IN_A_YEAR;
        int remainingDaysAfterYears = totalDays % DAYS_IN_A_YEAR;
        int weeks = remainingDaysAfterYears / DAYS_IN_A_WEEK;
        int days = remainingDaysAfterYears % DAYS_IN_A_WEEK;

        // Print the results
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);

        // Close the scanner
        scanner.close();
    }
}