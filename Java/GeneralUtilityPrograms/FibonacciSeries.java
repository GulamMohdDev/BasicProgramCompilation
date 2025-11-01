// A simple Java program to print the Fibonacci series up to a specified number of terms
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms for Fibonacci Series:");
        int n =new Scanner(System.in).nextInt(); // You can change this value to compute more or fewer terms
        long firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
