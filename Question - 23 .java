import java.util.Scanner;

public class Q23 {
    static int totalPrimeChecks = 0;

    boolean isPrime(int num) {
        totalPrimeChecks++;

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q23 p = new Q23();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (p.isPrime(num)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        System.out.println("Total checks: " + totalPrimeChecks);
    }
}
