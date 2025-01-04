import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Do you love Java?");
            System.out.print("Yes for (Y/y) No for (N/n) : ");

            String userInput = input.nextLine();

            if (userInput.equals("Y") || userInput.equals("y")) {
                System.out.println("You are a Java lover!");
            } else if (userInput.equals("N") || userInput.equals("n")) {
                System.out.println("You are not a Java lover!");
            } else {
                System.out.println("Wrong input. Try again!");
            }

        } catch (Exception E) {
            // handle exception
        }
    }

}
