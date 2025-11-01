// Count the number of digits in a given number
public class CoundDigitInNumber {
    public static void main(String[] args) {
        System.out.println("Counting digits in a number:");
        int number = 123456; // You can change this value to test other numbers
        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("The number " + number + " has " + count + " digits.");
        System.out.println("The number " + number + " has " + (number+"").length() + " digits.");
    }
}
