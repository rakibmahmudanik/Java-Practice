import java.util.*;

class factorial {

    public static int printFactorial(int n) {

        if (n < 0) {
            System.out.println("Negative value is not allowed");
            return n;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial + " is the factorial of " + n);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}