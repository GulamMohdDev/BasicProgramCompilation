// A simple Java program to generate Pascal's Triangle up to a specified number of rows
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter Rows for Pascal's Triangle:");
        int rows = new Scanner(System.in).nextInt(); // You can change this value to generate more or fewer rows

        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", ""); // Formatting for triangle shape
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
