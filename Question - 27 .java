import java.util.Scanner;

public class Q27 {
    static int totalReversals = 0;

    String reverseString(String text) {
        totalReversals++;

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q27 r = new Q27();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Reversed string: " + r.reverseString(text));
        System.out.println("Total reversals: " + totalReversals);
    }
}
