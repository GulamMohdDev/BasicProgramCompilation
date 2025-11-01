//Program to demonstrate command line arguments in Java
public class CommandLineArgs {
    public static void main(String[] args) {
        // Check if any command line arguments are provided
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            // Loop through the command line arguments and print each one
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}
