import java.util.Scanner;

public class Problem10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int B = sc.nextInt();
    int H = sc.nextInt();

    if (B > 0 && B <= 100 && H > 0 && H <= 100) {
      int A = B * H;
      System.out.println(A);
    } else {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    sc.close();
  }
}