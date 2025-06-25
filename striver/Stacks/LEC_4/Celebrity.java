public class Celebrity {
    public static int celebrity(int[][] M) {
        int top = 0;
        int down = M.length - 1;

        // Step 1: Find the potential celebrity
        while (top < down) {
            if (M[top][down] == 1) {
                // top knows down → top can't be a celebrity
                top++;
            } else {
                // top does not know down → down can't be a celebrity
                down--;
            }
        }

        int candidate = top;

        // Step 2: Verify the candidate
        for (int i = 0; i < M.length; i++) {
            if (i == candidate) continue;

            // Candidate must not know i, and everyone must know candidate
            if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int data[][] = {
            {1, 1, 1, 0},  // person 0
            {0, 1, 0, 0},  // person 1
            {1, 1, 0, 0},  // person 2
            {1, 1, 1, 1}   // person 3
        };

        System.out.println(celebrity(data));
    }
}
