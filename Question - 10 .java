import java.util.Scanner;

public class Q10 {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q10 m = new Q10();

        System.out.print("Enter movie name: ");
        m.name = sc.nextLine();

        System.out.print("Enter genre: ");
        m.genre = sc.nextLine();

        System.out.print("Enter rating: ");
        m.rating = sc.nextDouble();

        System.out.println("Movie: " + m.name);
        System.out.println("Genre: " + m.genre);
        System.out.println("Rating: " + m.rating);
        System.out.println("Industry: " + industry);
    }
}
