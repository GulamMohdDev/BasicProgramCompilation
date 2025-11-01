// A simple Java program to check if a number is a perfect number
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is a strong number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
