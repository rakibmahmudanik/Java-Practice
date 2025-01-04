import java.util.Scanner;
import java.math.BigInteger;

public class BigintegerTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a large integer: ");
    String userInput = scanner.next();

    BigInteger bigInteger = new BigInteger(userInput);
    System.out.println("The large integer you entered is: " + bigInteger);

    scanner.close();
  }
}
