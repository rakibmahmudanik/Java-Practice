import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Print sum of odd numbers from n - m
            int n, m, i, sum = 0;
            System.out.println("======== Print Some of ODD number from m-n ========");

            System.out.print("Enter a starting number: ");
            n = input.nextInt();
            System.out.print("Enter a ending number: ");
            m = input.nextInt();

            System.out.println("Odd numbers are: ");
            for (i = n; i <= m; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                    sum = sum + i;
                }
            }
            System.out.println("Total = " + sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
