import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Plrint factorial value");
            System.out.print("Enter a number of n: ");
            int n = input.nextInt();
            int i, factorial = 1;
            for (i = n; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.print("Factorial of " + n + ": ");
            System.out.println(factorial);
        } catch (Exception e) {

        }
    }
}