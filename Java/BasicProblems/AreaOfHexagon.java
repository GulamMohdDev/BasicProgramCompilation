//Program to calculate the area of a hexagon given the length of its side
public class AreaOfHexagon {
    public static void main(String[] args) {
        double side = 6.0; // You can change this value to test other side lengths
        double area = (3 * Math.sqrt(3) / 2) * side * side;
        System.out.println("Area of hexagon with side " + side + " is: " + area);
    }
}
