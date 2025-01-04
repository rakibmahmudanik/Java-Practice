import java.util.*;

public class magicName {

    public static void printName(String name) {

        for (int i = 0; i < name.length(); i++) {

            if (name == "A") {
                System.out.print("Rwww");
            } else if (name == "B") {
                System.out.print("BB");
            } else {
                System.out.println("TTt");
            }
        }

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        printName(name);
    }

}