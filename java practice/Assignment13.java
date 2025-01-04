
// find nth fibonacci number
import java.util.Scanner;

public class Assignment13 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("which fibonacci number you want to see? ");
      int n = input.nextInt();
      int i, f, s;

      f = 0; // first fibonacci number
      s = 1; // second fibonacci number

      System.out.print(f + " " + s + " ");
      for (i = 3; i <= n; i++) {
        int fibonacci = f + s;
        System.out.print(fibonacci + " ");
        f = s;
        s = fibonacci;
      }
    }
  }
}