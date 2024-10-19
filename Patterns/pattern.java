import java.util.Scanner;

public class pattern {

    static void pattern1(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int lines;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of lines you want to print:");
            lines = scan.nextInt();
        }
        pattern1(lines);
    }
}
