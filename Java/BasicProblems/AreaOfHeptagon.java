//Program to calculate the area of a heptagon given the length of its side
public class AreaOfHeptagon {
    public static void main(String[] args) {
        double side = 7.0; // You can change this value to test other side lengths
        double area = (7 / 4.0) * side * side * (1 / Math.tan(Math.PI / 7));
        System.out.println("Area of heptagon with side " + side + " is: " + area);
    }
}
