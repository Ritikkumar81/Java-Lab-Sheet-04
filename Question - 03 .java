import java.util.Scanner;

public class Q3 {
    double radius;
    static final double PI = 3.14;

    void display() {
        System.out.println("Area: " + (PI * radius * radius));
        System.out.println("Circumference: " + (2 * PI * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 c = new Q3();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        c.display();
    }
}
