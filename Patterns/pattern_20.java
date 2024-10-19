public class pattern_20 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 2 * n - 2;

        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i;
            if(i > n){
                stars = 2 * n - i ;
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // Print spaces
            for (int j = 0; j <spaces; j++) {
                System.out.print("  ");
            }

            // Print stars again
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i <n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
}
