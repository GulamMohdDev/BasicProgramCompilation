//Program to demonstrate the use of ArrayList in Java
public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Printing the elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
