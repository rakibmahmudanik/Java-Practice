import java.util.Scanner;

public class OutputFormatting {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    String name1 = scanner.next();
    int num1 = scanner.nextInt();

    String name2 = scanner.next();
    int num2 = scanner.nextInt();

    String name3 = scanner.next();
    int num3 = scanner.nextInt();

    System.out.println("================================");

    System.out.printf("%-15s%03d\n%-15s%03d\n%-15s%03d\n ", name1, num1, name2, num2, name3, num3);

    System.out.println("================================");

    scanner.close();
  }

}
