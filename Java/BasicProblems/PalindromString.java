// A simple Java program to check if a string is a palindrome
import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it's a palindrome:");
        String str = new Scanner(System.in).nextLine(); // You can change this value to test other strings
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
