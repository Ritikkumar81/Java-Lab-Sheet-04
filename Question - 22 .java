import java.util.Scanner;

public class Q22 {
    static int totalChecks = 0;

    boolean isArmstrong(int num) {
        totalChecks++;

        int original = num;
        int temp = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return num >= 0 && sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q22 a = new Q22();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (a.isArmstrong(num)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        System.out.println("Total checks: " + totalChecks);
    }
}
