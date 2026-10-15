import java.util.Scanner;

public class Q25 {
    static int totalCalls = 0;

    long factorial(int n) {
        totalCalls++;

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q25 f = new Q25();

        System.out.print("Enter a number (0-20): ");
        int n = sc.nextInt();

        if (n >= 0 && n <= 20) {
            System.out.println("Factorial: " + f.factorial(n));
        } else {
            System.out.println("Enter a number between 0 and 20.");
        }

        System.out.println("Method calls: " + totalCalls);
    }
}
