// A simple Java program to find the largest number among ten user-inputted numbers
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i=0;i<numbers.length;i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
