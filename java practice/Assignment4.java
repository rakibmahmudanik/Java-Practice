import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment4 {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros

      System.out.print("Number of installments? ");
      // get number of installments from user
      int numberOfInstallment = input.nextInt();

      // calculate  installment amount for per month
      float installmentPerMonth = phonePrice / numberOfInstallment;
      
      System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");

    }catch (Exception E) { }
  }
}