import java.util.Scanner;

public class PaindromNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it's a palindrome:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
 
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
