import java.util.Scanner;

public class Q8 {
    String color, type;
    static String manufacturer = "ABC Pens";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q8 p = new Q8();

        System.out.print("Enter pen color: ");
        p.color = sc.nextLine();

        System.out.print("Enter pen type: ");
        p.type = sc.nextLine();

        System.out.println("Color: " + p.color);
        System.out.println("Type: " + p.type);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
