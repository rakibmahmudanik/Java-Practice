import java.util.Scanner;

public class Problem7 {
  public static void main(String[] args) {

    int q, a, b, n;
    Scanner sc = new Scanner(System.in);
    q = sc.nextInt();
    for (int i = 1; i <= q; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      n = sc.nextInt();

      int calc = a + (int) Math.pow(2, 0) * b;
      System.out.print(calc);
      for (int j = 1; j <= n - 1; j++) {
        calc = calc + (int) Math.pow(2, j) * b;
        System.out.print(" " + calc);

      }

      System.out.println();

    }

    sc.close();

  }

}
