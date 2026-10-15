import java.util.Scanner;

public class Q21 {
    static int countChecks = 0;

    boolean isPalindrome(int num) {
        countChecks++;

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original >= 0 && original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q21 p = new Q21();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (p.isPalindrome(num)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }

        System.out.println("Checks performed: " + countChecks);
    }
}
