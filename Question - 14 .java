import java.util.Scanner;

public class Q14 {
    String name;
    int age;
    static String country = "India";

    void checkVoting() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q14 p = new Q14();

        System.out.print("Enter name: ");
        p.name = sc.nextLine();

        System.out.print("Enter age: ");
        p.age = sc.nextInt();

        p.checkVoting();
    }
}
