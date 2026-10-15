import java.util.Scanner;

public class Q4 {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 e = new Q4();

        System.out.print("Enter employee ID: ");
        e.empId = sc.nextInt();

        System.out.print("Enter salary: ");
        e.salary = sc.nextDouble();

        System.out.println("Employee ID: " + e.empId);
        System.out.println("Salary: " + e.salary);
        System.out.println("Company: " + companyName);
    }
}
