// A simple Java program to generate Floyd's Triangle
public class FloydTriangle {
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle:");
        int rows = 5; // You can change this value to generate more or fewer rows
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
