//Program to calculate the area of a pentagon given the length of its side
public class AreaOfPentagon {
    public static void main(String[] args) {
        double side = 5.0; // You can change this value to test other side lengths
        double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side) / 4;
        System.out.println("Area of pentagon with side " + side + " is: " + area);
    }
}
