import java.util.Scanner;

public class Q9 {
    String brand;
    int ram;
    static String os = "Windows";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q9 l = new Q9();

        System.out.print("Enter laptop brand: ");
        l.brand = sc.nextLine();

        System.out.print("Enter RAM in GB: ");
        l.ram = sc.nextInt();

        System.out.println("Brand: " + l.brand);
        System.out.println("RAM: " + l.ram + " GB");
        System.out.println("Operating system: " + os);
    }
}
