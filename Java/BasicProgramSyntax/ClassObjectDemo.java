//Program to demonstrate class and object creation in Java
public class ClassObjectDemo {
    // Program to demonstrate class and object creation in Java
    int number;

    // Method to set the value of number
    void setNumber(int num) {
        number = num;
    }

    // Method to display the value of number
    void displayNumber() {
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        // Creating an object of ClassObjectDemo
        ClassObjectDemo obj = new ClassObjectDemo();

        // Setting the value of number using the object
        obj.setNumber(42);

        // Displaying the value of number using the object
        obj.displayNumber();
    }
}
