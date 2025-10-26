// A Java program to check if a number is an Armstrong number
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is an Armstrong number:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int originalNumber = number;
        int sumOfCubes = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number /= 10;
        }

        if (sumOfCubes == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
