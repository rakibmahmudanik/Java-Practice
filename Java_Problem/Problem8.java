import java.math.BigInteger;
import java.util.Scanner;

public class Problem8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BigInteger byMin = BigInteger.valueOf(Byte.MIN_VALUE);
    BigInteger byMax = BigInteger.valueOf(Byte.MAX_VALUE);

    BigInteger shMin = BigInteger.valueOf(Short.MIN_VALUE);
    BigInteger shMax = BigInteger.valueOf(Short.MAX_VALUE);

    BigInteger inMin = BigInteger.valueOf(Integer.MIN_VALUE);
    BigInteger inMax = BigInteger.valueOf(Integer.MAX_VALUE);

    BigInteger lnMin = BigInteger.valueOf(Long.MIN_VALUE);
    BigInteger lnMax = BigInteger.valueOf(Long.MAX_VALUE);

    int T = sc.nextInt();
    for (int i = 1; i <= T; i++) {
      BigInteger n = sc.nextBigInteger();

      if ((n.compareTo(byMax) <= 0 && n.compareTo(byMin) >= 0) && (n.compareTo(shMax) <= 0 && n.compareTo(shMin) >= 0)
          && (n.compareTo(inMax) <= 0 && n.compareTo(inMin) >= 0)
          && (n.compareTo(lnMax) <= 0 && n.compareTo(lnMin) >= 0)) {
        System.out.println(n + " can be fitted in:\n" + "* byte\n" + "* short\n" + "* int\n" + "* long");
      } else if ((n.compareTo(shMax) <= 0 && n.compareTo(shMin) >= 0)
          && (n.compareTo(inMax) <= 0 && n.compareTo(inMin) >= 0)
          && (n.compareTo(lnMax) <= 0 && n.compareTo(lnMin) >= 0)) {
        System.out.println(n + " can be fitted in:\n" + "* short\n" + "* int\n" + "* long");
      } else if ((n.compareTo(inMax) <= 0 && n.compareTo(inMin) >= 0)
          && (n.compareTo(lnMax) <= 0 && n.compareTo(lnMin) >= 0)) {
        System.out.println(n + " can be fitted in:\n" + "* int\n" + "* long");
      } else if ((n.compareTo(lnMax) <= 0 && n.compareTo(lnMin) >= 0)) {
        System.out.println(n + " can be fitted in:\n" + "* long");
      } else {
        System.out.println(n + " can't be fitted anywhere.");
      }
    }
    sc.close();
  }

}
