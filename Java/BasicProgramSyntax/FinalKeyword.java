//Program to demonstrate the use of the final keyword in Java
public class FinalKeyword {
    public static void main(String[] args) {
        // Declaring a final variable
        final int MAX_VALUE = 100;

        // Trying to change the value of the final variable will cause a compile-time error
        // MAX_VALUE = 200; // Uncommenting this line will result in an error

        System.out.println("The maximum value is: " + MAX_VALUE);
    }
}
