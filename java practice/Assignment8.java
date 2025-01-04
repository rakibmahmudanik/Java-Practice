import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Yes for (Y/y) No for (N/n)");
            System.out.print("Have you completed your masters? ");
            String userInputEdu = input.next();
            System.out.print("Are you fluent in english? ");
            String userInputLang = input.next();

            if ((userInputEdu.equals("Y") || userInputEdu.equals("y"))
                    && (userInputLang.equals("Y") || userInputLang.equals("y"))) {
                System.out.println("You are eligible to for the job interview.");
            } else {
                System.out.println("Sorry! you are not eligible to the job interview");
            }

        } catch (Exception E) {
            // handle exception
        }
    }

}
