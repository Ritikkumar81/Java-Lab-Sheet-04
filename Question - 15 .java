import java.util.Scanner;

public class Q15 {
    double principal, rate, time;
    static String bankName = "ABC Bank";

    double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q15 s = new Q15();

        System.out.print("Enter principal amount: ");
        s.principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        s.rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        s.time = sc.nextDouble();

        System.out.println("Bank: " + bankName);
        System.out.println("Simple Interest: " + s.calculateInterest());
    }
}
