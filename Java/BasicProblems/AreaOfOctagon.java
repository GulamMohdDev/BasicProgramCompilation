//Program to calculate the area of an octagon given the length of its side
public class AreaOfOctagon {
    public static void main(String[] args) {
        double side = 8.0; // You can change this value to test other side lengths
        double area = 2 * (1 + Math.sqrt(2)) * side * side;
        System.out.println("Area of octagon with side " + side + " is: " + area);
    }
}
