// A simple Java program to check if a number is a Spy number
public class SpyNumber {
    public static void main(String[] args) {
        System.out.println("Checking if a number is a Spy number:");
        int number = new java.util.Scanner(System.in).nextInt(); // You can change this value to test other numbers
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        if (sumOfDigits == productOfDigits) {
            System.out.println(number + " is a Spy number.");
        } else {
            System.out.println(number + " is not a Spy number.");
        }
    }
}
