import java.util.Scanner;

public class Q20 {
    double balance;
    static String bankCode = "ABC101";

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q20 account = new Q20();

        System.out.print("Enter balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        System.out.println("Bank code: " + bankCode);
        account.withdraw(amount);
    }
}
