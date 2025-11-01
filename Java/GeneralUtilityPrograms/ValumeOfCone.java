//Program to calculate the volume of a cone given its radius and height
public class ValumeOfCone {
    public static void main(String[] args) {
        double radius = 3.0; // You can change this value to test other radii
        double height = 4.0; // You can change this value to test other heights
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of cone with radius " + radius + " and height " + height + " is: " + volume);
    }
}
