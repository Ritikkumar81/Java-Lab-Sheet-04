import java.util.Scanner;

public class Q5 {
    String title, author;
    double price;
    static String publisher = "ABC Publications";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5 b = new Q5();

        System.out.print("Enter book title: ");
        b.title = sc.nextLine();

        System.out.print("Enter author: ");
        b.author = sc.nextLine();

        System.out.print("Enter price: ");
        b.price = sc.nextDouble();

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
        System.out.println("Publisher: " + publisher);
    }
}
