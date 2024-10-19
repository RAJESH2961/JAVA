
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String data = scan.nextLine();
        // System.out.println("Hi !" + data);   
        System.out.println("Enter Your age ");
        int age = scan.nextInt();
        System.out.println("Enter your fav food ");
        String food = scan.nextLine();
        System.out.println(data);
    }
    
}
