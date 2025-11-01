// A simple Java program to check if a number is a Neon number
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is a perfect number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
