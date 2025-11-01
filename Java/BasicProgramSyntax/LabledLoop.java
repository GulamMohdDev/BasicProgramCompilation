//Program to demonstrate labeled loops in Java
public class LabledLoop {
    public static void main(String[] args) {
        // Using a labeled loop to demonstrate breaking out of nested loops
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
