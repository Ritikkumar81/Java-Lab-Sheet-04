import java.util.Scanner;

public class Q6 {
    String brand;
    double mileage;
    static int wheels = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q6 c = new Q6();

        System.out.print("Enter car brand: ");
        c.brand = sc.nextLine();

        System.out.print("Enter mileage: ");
        c.mileage = sc.nextDouble();

        System.out.println("Brand: " + c.brand);
        System.out.println("Mileage: " + c.mileage);
        System.out.println("Wheels: " + wheels);
    }
}
