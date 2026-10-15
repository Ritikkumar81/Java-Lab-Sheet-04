import java.util.Scanner;

public class Q13 {
    double celsius;
    static String scale = "Celsius";

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperature scale: " + scale);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q13 t = new Q13();

        System.out.print("Enter temperature in Celsius: ");
        t.celsius = sc.nextDouble();

        t.convert();
    }
}
