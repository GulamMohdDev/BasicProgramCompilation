public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Generate a random number between 0 and 100
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Random Number: " + randomNum);
    }
}
