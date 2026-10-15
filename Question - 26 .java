import java.util.Scanner;

public class Q26 {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2 Matrix";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q26 a = new Q26();
        Q26 b = new Q26();

        System.out.println("Enter first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a.matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b.matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(
                    (a.matrix[i][j] + b.matrix[i][j]) + "\t"
                );
            }
            System.out.println();
        }

        System.out.println("Matrix subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(
                    (a.matrix[i][j] - b.matrix[i][j]) + "\t"
                );
            }
            System.out.println();
        }

        System.out.println("Type: " + matrixType);
    }
}
