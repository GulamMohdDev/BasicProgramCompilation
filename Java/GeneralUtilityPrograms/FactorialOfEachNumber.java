// A simple Java program to compute the factorial of each number from 1 to N
import java.util.Scanner;

public class FactorialOfEachNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate Nth number factorials:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Factorials of numbers from 1 to "+n+":");
        for (int i = 1; i <= n; i++) {
            System.out.println("Factorial of " + i + " is " + factorial(i));
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
