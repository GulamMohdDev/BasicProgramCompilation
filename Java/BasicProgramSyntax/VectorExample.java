//Program to demonstrate a vector (ArrayList) in Java
public class VectorExample {
    public static void main(String[] args) {
        // Creating a vector (ArrayList) of integers
        java.util.Vector<Integer> vector = new java.util.Vector<>();

        // Adding elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Printing the elements of the vector
        System.out.println("Elements in the vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
    }
}
