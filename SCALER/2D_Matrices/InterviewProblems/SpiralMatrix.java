import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Initialize matrix with empty lists
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                row.add(0);  // Fill initially with 0s
            }
            ans.add(row);
        }

        int top = 0, bottom = A - 1, left = 0, right = A - 1;
        int count = 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int j = left; j <= right; j++) {
                ans.get(top).set(j, count++);
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                ans.get(i).set(right, count++);
            }
            right--;

            // Move left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.get(bottom).set(j, count++);
                }
                bottom--;
            }

            // Move up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.get(i).set(left, count++);
                }
                left++;
            }
        }
        return ans;
    }

    // The main method is only for testing; remove it if not needed
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        ArrayList<ArrayList<Integer>> matrix = sm.generateMatrix(4); // Example input
        System.out.print(matrix); // Print the result for testing
    }
}
