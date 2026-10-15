import java.util.Scanner;

public class Q28 {
    static String language = "Java";

    int countWords(String text) {
        text = text.trim();

        if (text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q28 w = new Q28();

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.println("Language: " + language);
        System.out.println("Word count: " + w.countWords(text));
    }
}
