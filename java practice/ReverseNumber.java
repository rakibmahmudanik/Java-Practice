import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Make your digit reverse order > ");
            System.out.print("Enter your digit : ");
            int number = input.nextInt();

            int r, reverse = 0;
            int temp = number;
            while (temp != 0) {

                r = temp % 10;
                reverse = reverse * 10 + r;
                temp = temp / 10;

            }
            System.out.println(reverse);

        } catch (Exception e) {
        }
    }
}
