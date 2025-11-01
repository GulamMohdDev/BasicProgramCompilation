//Program to calculate the volume of a hemisphere given its radius
public class ValumeOfHemisphere {
    public static void main(String[] args) {
        double radius = 5.0; // You can change this value to test other radii
        double volume = (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of hemisphere with radius " + radius + " is: " + volume);
    }
}
