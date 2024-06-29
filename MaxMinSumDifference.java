import java.util.Arrays;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;
        
        // Step 1: Sort the array in ascending order
        Arrays.sort(array);
        
        // Step 2: Calculate the Mth maximum and Nth minimum numbers
        int mthMax = array[array.length - M];
        int nthMin = array[N - 1];
        
        // Step 3: Calculate sum and difference
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        
        // Step 4: Print the results
        System.out.println("1st Maximum Number = " + mthMax);
        System.out.println("3rd Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
