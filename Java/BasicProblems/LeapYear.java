// A simple Java program to check if a given year is a leap year
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to check if it's a leap year:");
        int year = new Scanner(System.in).nextInt(); // You can change this value to test other years

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
