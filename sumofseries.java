import java.util.Scanner;
 
public class sumofseries {
    public static float getSum(int a, int n)
    {
        float sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += (i / Math.pow(a, i));
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int a = 3, n = 3;
        System.out.println(getSum(a, n));
    }
}