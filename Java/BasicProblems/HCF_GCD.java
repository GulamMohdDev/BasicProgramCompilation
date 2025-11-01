// Program to find HCF/GCD of two numbers
public class HCF_GCD {
    public static void main(String[] args) {
        int num1 = 54; // You can change this value to test other numbers
        int num2 = 24; // You can change this value to test other numbers

        int hcf = 1; // Initialize HCF to 1

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update HCF if 'i' is a common factor
            }
        }

        System.out.println("HCF/GCD of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
