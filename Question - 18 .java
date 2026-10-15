import java.util.Scanner;

public class Q18 {
    int units;
    static double fixedCharge = 50;

    void calculateBill() {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } else {
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
        }

        bill += fixedCharge;

        System.out.println("Total electricity bill: " + bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q18 e = new Q18();

        System.out.print("Enter units consumed: ");
        e.units = sc.nextInt();

        if (e.units < 0) {
            System.out.println("Units cannot be negative.");
        } else {
            e.calculateBill();
        }
    }
}
