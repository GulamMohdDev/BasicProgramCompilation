// A simple Java program to swap two numbers
public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5; // You can change this value to test other numbers
        int b = 10; // You can change this value to test other numbers

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
