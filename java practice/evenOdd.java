import java.util.*;

class evenOdd {
    // Function to find if a number is even or odd
    public static int checkEvenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkEvenOdd(n);
    }
}