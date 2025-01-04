import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //// Declearing Data Type of Product details
        int id;
        String title, price, description, category;

        // Get Input From User
        System.out.println("Please Enter your product details below:");
        System.out.print("id : ");
        id = sc.nextInt();

        System.out.print("title : ");
        title = sc.next();

        System.out.print("price : ");
        price = sc.next();

        System.out.print("description : ");
        description = sc.next();

        System.out.print("category : ");
        category = sc.next();

        // print value
        System.out.println(id + "\n" + title + "\n" + price + "\n" + description + "\n" + category);

    }
}