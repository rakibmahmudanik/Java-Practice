
// 1. generate and print palindrome numbers from m-n 
// 2. count and print number of palindrome numbers
import java.util.Scanner;

public class Assignment14 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int n = input.nextInt();

      System.out.print("end number: ");
      int m = input.nextInt();

      int totalPalindromeNumber = 0;

      System.out.println("Palindrome numbers are: ");

      for (int i = n; i <= m; i++) {
        int r, reverse = 0;
        int temp = i;
        while (temp != 0 && i > 10) {

          r = temp % 10;
          reverse = reverse * 10 + r;
          temp = temp / 10;

        }

        if (i == reverse) {

          System.out.print(" " + i);
          totalPalindromeNumber++;
        }
      }
      System.out.println();

      System.out.println("Total Palindrome numbers : " + totalPalindromeNumber);
    }
  }
}