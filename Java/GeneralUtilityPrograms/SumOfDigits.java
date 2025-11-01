// A simple Java program to calculate the sum of digits of a number
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
