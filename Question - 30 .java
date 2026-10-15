import java.util.Scanner;

public class Q30 {
    int booksAvailable;
    static String libraryName = "College Library";

    void issueBook() {
        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        booksAvailable++;
        System.out.println("Book returned successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q30 library = new Q30();

        System.out.print("Enter available books: ");
        library.booksAvailable = sc.nextInt();

        if (library.booksAvailable < 0) {
            System.out.println("Invalid book count.");
            return;
        }

        System.out.println("Library: " + libraryName);

        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                library.issueBook();
                break;
            case 2:
                library.returnBook();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("Books available: " + library.booksAvailable);
    }
}
