//Program to find LCM of two numbers

public class LCM {
    public static void main(String[] args) {
        int num1 = 12; // You can change this value to test other numbers
        int num2 = 15; // You can change this value to test other numbers

        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
