//Program to calculate the area of an equilateral triangle given the length of its side

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        double side = 6.0; // You can change this value to test other side lengths
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of equilateral triangle with side " + side + " is: " + area);
    }
}
