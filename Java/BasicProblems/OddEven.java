import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number:");

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
}
