// A Java program to check if a number is an Automorphic number
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is an Automorphic number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int square = number * number;

        String numberStr = Integer.toString(number);
        String squareStr = Integer.toString(square);

        if (squareStr.endsWith(numberStr)) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }
    }
}
