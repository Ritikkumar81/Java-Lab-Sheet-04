import java.util.Scanner;

public class Q29 {
    String name;
    double salary;
    static String organization = "ABC Organization";

    void compareSalary(Q29 other) {
        if (salary > other.salary) {
            System.out.println(name + " has the higher salary.");
        } else if (salary < other.salary) {
            System.out.println(other.name + " has the higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q29 e1 = new Q29();
        Q29 e2 = new Q29();

        System.out.print("Enter first employee name: ");
        e1.name = sc.nextLine();

        System.out.print("Enter first employee salary: ");
        e1.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter second employee name: ");
        e2.name = sc.nextLine();

        System.out.print("Enter second employee salary: ");
        e2.salary = sc.nextDouble();

        System.out.println("Organization: " + organization);
        e1.compareSalary(e2);
    }
}
