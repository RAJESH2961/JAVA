import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        // Getting the Console instance
        Console console = System.console();
        
        // Check if console is available
        if (console == null) {
            System.out.println("No console available.");
            return;
        }
        
        // Reading a username
        String username = console.readLine("Enter your username: ");
        
        // Reading a password securely
        char[] passwordArray = console.readPassword("Enter your password: ");
        String password = new String(passwordArray); // Convert char array to String
        
        // Displaying the entered data
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
