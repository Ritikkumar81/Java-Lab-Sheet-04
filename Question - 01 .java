public class Q1 {
    String name;
    int age;
    static int count = 0;

    public static void main(String[] args) {
        Q1 s = new Q1();

        String studentName = "Prince";
        int studentAge = 20;

        s.name = studentName;
        s.age = studentAge;
        count++;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Student count: " + count);
    }
}
