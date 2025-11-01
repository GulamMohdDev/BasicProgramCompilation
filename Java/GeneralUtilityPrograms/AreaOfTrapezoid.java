//Program to calculate the area of a trapezoid given the lengths of its two bases and its height
public class AreaOfTrapezoid {
    public static void main(String[] args) {
        double base1 = 5.0; // You can change this value to test other base lengths
        double base2 = 7.0; // You can change this value to test other base lengths
        double height = 4.0; // You can change this value to test other heights
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area of trapezoid with bases " + base1 + ", " + base2 + " and height " + height + " is: " + area);
    }
}
