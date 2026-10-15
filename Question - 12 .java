import java.util.Scanner;

public class Q12 {
    int marks1, marks2, marks3;
    static String universityName = "ABC University";

    double average() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q12 s = new Q12();

        System.out.print("Enter marks in three subjects: ");
        s.marks1 = sc.nextInt();
        s.marks2 = sc.nextInt();
        s.marks3 = sc.nextInt();

        System.out.println("University: " + universityName);
        System.out.println("Average marks: " + s.average());
    }
}
