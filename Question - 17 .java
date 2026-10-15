import java.util.Scanner;

public class Q17 {
    String name;
    int marks;
    static int passingMarks = 40;

    void showGrade() {
        System.out.println("Student: " + name);

        if (marks < passingMarks) {
            System.out.println("Fail");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q17 s = new Q17();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        s.showGrade();
    }
}
