// A simple Java program to reverse a given number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
