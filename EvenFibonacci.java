import java.util.Scanner;

class EvenFibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int i;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[50];
        for (i = 0; i <10; i++) {
            a[i] = n1;
            System.out.print(a[i] + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        int sum = 0;
        for (i = 0; i <= num*2; i = i + 2) {
            sum = sum + a[i];
        }
        System.out.println("\nSum of even indexes: " + sum);
    }
}