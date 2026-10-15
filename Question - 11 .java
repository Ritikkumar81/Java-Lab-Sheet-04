import java.util.Scanner;

public class Q11 {
    static int operationsCount = 0;

    int add(int a, int b) {
        operationsCount++;
        return a + b;
    }

    int subtract(int a, int b) {
        operationsCount++;
        return a - b;
    }

    int multiply(int a, int b) {
        operationsCount++;
        return a * b;
    }

    double divide(int a, int b) {
        operationsCount++;
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q11 c = new Q11();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtract(a, b));
        System.out.println("Multiplication: " + c.multiply(a, b));

        if (b != 0) {
            System.out.println("Division: " + c.divide(a, b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Operations performed: " + operationsCount);
    }
}
