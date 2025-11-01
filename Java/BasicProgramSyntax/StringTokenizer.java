//Program to demonstrate the use of StringTokenizer in Java
public class StringTokenizer {
    public static void main(String[] args) {
        // Sample string to be tokenized
        String str = "Hello, welcome to the world of Java programming.";

        // Creating a StringTokenizer object
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(str, " ,.");

        // Printing the tokens
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
