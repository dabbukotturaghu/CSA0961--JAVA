public class Composite {
    public static void main(String[] args) {
        int a = 12;
        int b = 19;

        System.out.print("Composite numbers between " + a + " and " + b + ": ");
        boolean first = true;

        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                if (first) {
                    System.out.print(i);
                    first = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        boolean isComposite = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isComposite = true;
                break;
            }
        }
        return isComposite;
    }
}
