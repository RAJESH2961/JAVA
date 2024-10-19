public class pattern_7 {
    public static void main(String[] args) {
        //0         *          [4,1,4]
        //1       * * *        [3,3,3]
        //2     * * * * *      [2,5,2]
        //3   * * * * * * *    [1,7,1]
        //4 * * * * * * * * *  [0,9,0] 
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Left spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            // Right spaces (optional, same as left spaces for symmetry)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
