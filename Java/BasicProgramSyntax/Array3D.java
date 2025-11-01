//Program to demonstrate a 3D array in Java
public class Array3D {
    public static void main(String[] args) {
        // Creating a 3D array of integers
        int[][][] cube = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Printing the elements of the 3D array
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
            System.out.println(); // Separate layers with a blank line
        }
    }
}
