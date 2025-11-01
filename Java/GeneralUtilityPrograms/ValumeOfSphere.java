//Program to calculate the volume of a sphere given its radius
public class ValumeOfSphere {
    public static void main(String[] args) {
        double radius = 5.0; // You can change this value to test other radii
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of sphere with radius " + radius + " is: " + volume);
    }
}
