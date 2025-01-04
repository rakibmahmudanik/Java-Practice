import java.util.Scanner;

public class BtrflyPattrn {
  public static void main(String[] args) {
    int n, i, j;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your value: ");
    n = sc.nextInt();

    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();

    }

    for (i = n; i >= 1; i--) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();

    }

  }
}
