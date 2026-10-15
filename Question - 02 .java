import java.util.Scanner;

public class Q2 {
    double length, breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 r = new Q2();

        System.out.print("Enter length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        r.breadth = sc.nextDouble();

        r.calculateArea();
    }
}
