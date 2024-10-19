import java.util.Scanner;

public class printNames {
   void printName(int i, int n){
        if (i > n){
            return;
        }
        System.out.println(i + " : Rajesh");
        printName(i+1 , n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = scan.nextInt();

        printNames obj = new printNames();
        obj.printName(1,n);
        scan.close(); // Close the scanner after use

    }
    
}
