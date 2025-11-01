// Problem Statement: Given a number n, we define super digit of that number using the following rules:
// If n has only 1 digit, then its super digit is n.
public class SuperDigit {
    public static void main(String[] args) {
        String n = "9875"; // You can change this value to test other numbers
        int k = 4; // You can change this value to test other repetitions

        StringBuilder initialSum = new StringBuilder();
        for (int i = 0; i < k; i++) {
            initialSum.append(n);
        }

        int superDigit = calculateSuperDigit(initialSum.toString());
        System.out.println("Super Digit: " + superDigit);
    }

    private static int calculateSuperDigit(String num) {
        if (num.length() == 1) {
            return Integer.parseInt(num);
        }

        int sum = 0;
        for (char digit : num.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return calculateSuperDigit(String.valueOf(sum));
    }
}
