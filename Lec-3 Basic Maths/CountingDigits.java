import java.util.InputMismatchException;
import java.util.Scanner;

class CountingDigits {

    public static int countDigit(int n) {
        int count = 0;
        if (n == 0) {
            return 1; // Special case for 0, which has 1 digit
        }
        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = 0;

        while (true) {
            System.out.println("Enter the Number: ");
            try {
                data = scan.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scan.next(); // Clear the invalid input
            }
        }

        System.out.println("Number of digits: " + countDigit(data));
        
        scan.close();
    }
}
