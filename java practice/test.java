import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("start number: ");
        int n = input.nextInt();

        System.out.print("end number: ");
        int m = input.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
