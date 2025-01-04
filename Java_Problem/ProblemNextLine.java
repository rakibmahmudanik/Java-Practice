import java.io.IOException;
import java.util.Scanner;

public class ProblemNextLine {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int integer = sc.nextInt();
    double FloatDouble = sc.nextDouble();
    // Consume the newline character
    sc.nextLine();
    String StringText = sc.nextLine();

    System.out.println("String: " + StringText);
    System.out.println("Double: " + FloatDouble);
    System.out.println("Int: " + integer);

    sc.close();
  }
}