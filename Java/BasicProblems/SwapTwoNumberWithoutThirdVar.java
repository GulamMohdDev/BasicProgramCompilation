// A simple Java program to swap two numbers without using a third variable
import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        int a = scanner.nextInt(); // You can change this value to test other numbers
        int b = scanner.nextInt(); // You can change this value to test other numbers

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b; // Step 1: Add both numbers and store the result in 'a'
        b = a - b; // Step 2: Subtract the new 'b' from 'a' to get the original 'a'
        a = a - b; // Step 3: Subtract the new 'b' from the new 'a' to get the original 'b'

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
