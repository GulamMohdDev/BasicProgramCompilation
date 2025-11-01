//Program to calculate the area of a rhombus given the lengths of its diagonals
public class AreaOfRhombus {
    public static void main(String[] args) {
        double diagonal1 = 8.0; // You can change this value to test other diagonal lengths
        double diagonal2 = 6.0; // You can change this value to test other diagonal lengths
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("Area of rhombus with diagonals " + diagonal1 + " and " + diagonal2 + " is: " + area);
    }
}
