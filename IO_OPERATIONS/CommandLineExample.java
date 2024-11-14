public class CommandLineExample {
    public static void main(String[] args) {
        // Check if arguments were passed
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
