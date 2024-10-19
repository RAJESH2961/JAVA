public class Backtracking_N_1 {
    // Print the values from n to 1 using backtracking
    void print(int i, int n) {
        if (i > n) {
            return;
        }
        print(i + 1, n);  // Call the function with i+1 to move towards the base case
        System.out.println(i);  // Print i after the recursive call, which backtracks
    }

    public static void main(String[] args) {
        Backtracking_N_1 obj = new Backtracking_N_1();
        obj.print(1, 5);  // Start from 1 and let backtracking print down to 5
    }
}
