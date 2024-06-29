public class PerfectNumbers {
    public static void main(String[] args) {
        int N = 3;
        int count = 0;
        int num = 1;

        System.out.print("First " + N + " perfect numbers are: ");
        
        while (count < N) {
            if (isPerfectNumber(num)) {
                if (count == 0) {
                    System.out.print(num);
                } else {
                    System.out.print(" , " + num);
                }
                count++;
            }
            num++;
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
