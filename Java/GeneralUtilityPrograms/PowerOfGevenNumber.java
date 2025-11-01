// A simple Java program to calculate and print the powers of 2 from 0 to 10
public class PowerOfGevenNumber {   
    public static void main(String[] args) {
        System.out.println("Calculating powers of 2 from 0 to 10:");
        int base = 2;
        int exponentLimit = 10;

        for (int exponent = 0; exponent <= exponentLimit; exponent++) {
            long power = power(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + power);
        }
    }
    
    static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
