import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter your age : ");
            int age = input.nextInt();

            if (age >= 18) {

                System.out.println("valid Voter");

            } else {
                System.out.println("Invalid Voter");
            }

        } catch (Exception e) {
        }
    }
}
