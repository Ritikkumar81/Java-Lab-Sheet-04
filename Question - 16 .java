import java.util.Scanner;

public class Q16 {
    double a, b, c;
    static String type;

    void checkTriangle() {
        if (a <= 0 || b <= 0 || c <= 0 ||
            a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle");
            return;
        }

        if (a == b && b == c) {
            type = "Equilateral";
        } else if (a == b || b == c || a == c) {
            type = "Isosceles";
        } else {
            type = "Scalene";
        }

        System.out.println("Valid triangle");
        System.out.println("Triangle type: " + type);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q16 t = new Q16();

        System.out.print("Enter three sides: ");
        t.a = sc.nextDouble();
        t.b = sc.nextDouble();
        t.c = sc.nextDouble();

        t.checkTriangle();
    }
}
