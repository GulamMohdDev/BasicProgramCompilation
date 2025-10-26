// A simple Java program to check if a number is a Neon number
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is a Neon number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int square = number * number;
        int sumOfDigits = 0;

        while (square != 0) {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
    }
}
