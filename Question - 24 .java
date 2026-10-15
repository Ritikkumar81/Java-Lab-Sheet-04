import java.util.Scanner;

public class Q24 {
    static int seriesCount = 0;

    void fibonacci(int n) {
        seriesCount++;

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q24 f = new Q24();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n > 0) {
            f.fibonacci(n);
        } else {
            System.out.println("Enter a positive number.");
        }

        System.out.println("Series generated: " + seriesCount);
    }
}
