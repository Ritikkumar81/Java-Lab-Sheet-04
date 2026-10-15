import java.util.Scanner;

public class Q7 {
    long accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q7 account = new Q7();

        System.out.print("Enter account number: ");
        account.accountNumber = sc.nextLong();

        System.out.print("Enter initial balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        System.out.println("Bank: " + bankName);
        account.deposit(amount);
    }
}
