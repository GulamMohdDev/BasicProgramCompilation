//Factorial Number

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to compute its factorial:");
        int number = new Scanner(System.in).nextInt(); // You can change this value to compute factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        
        int result = factorialWithRecursion(number);
        System.out.println("Recusion Factorial of " + number + " is: " + result);
    }

    static int factorialWithRecursion(int number) {
        if(number == 1) {
            return 1;
        }
        return number * factorialWithRecursion(number-1); 
    }
}
