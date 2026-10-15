import java.util.Scanner;

public class Q19 {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void displayPrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Original price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q19 p = new Q19();

        System.out.print("Enter product ID: ");
        p.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        p.name = sc.nextLine();

        System.out.print("Enter price: ");
        p.price = sc.nextDouble();

        p.displayPrice();
    }
}
