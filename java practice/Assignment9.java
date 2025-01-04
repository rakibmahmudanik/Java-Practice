import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press a number for your language selection: ");
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Bangali is selected");
                break;

            case 2:
                System.out.println("Hindi is selected");
                break;

            case 3:
                System.out.println("Urdu is selected");
                break;

            default:
                System.out.println("English is selected");
        }
    }

}
