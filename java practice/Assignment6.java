import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        // Print Number's spelling from 0 to 9 using If, else if, else condition.

        try (Scanner input = new Scanner(System.in)) {

            // get input from user
            System.out.print("Enter a number (0-9): ");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("ZERO");
            } else if (number == 1) {
                System.out.println("ONE");
            } else if (number == 2) {
                System.out.println("TWO");
            } else if (number == 3) {
                System.out.println("THREE");
            } else if (number == 4) {
                System.out.println("FOUR");
            } else if (number == 5) {
                System.out.println("FIVE");
            } else if (number == 6) {
                System.out.println("SIX");
            } else if (number == 7) {
                System.out.println("SEVEN");
            } else if (number == 8) {
                System.out.println("EIGHT");
            } else if (number == 9) {
                System.out.println("NINE");
            } else {
                System.out.println("Number should be 0-9!");
            }
        } catch (Exception E) {
        }
    }

}
