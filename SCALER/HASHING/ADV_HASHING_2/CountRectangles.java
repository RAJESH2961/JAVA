import java.util.*;

class CountRectangles {
    public int countRectangles(int[] A, int[] B) {
        int n = A.length;
        Set<String> pointSet = new HashSet<>();

        // Store all points as string "x y" for fast lookup
        for (int i = 0; i < n; i++) {
            pointSet.add(A[i] + " " + B[i]);
        }

        int count = 0;

        // Check all pairs of points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if they can be opposite corners of a rectangle
                if (A[i] != A[j] && B[i] != B[j]) {
                    String point1 = A[i] + " " + B[j];
                    String point2 = A[j] + " " + B[i];

                    if (pointSet.contains(point1) && pointSet.contains(point2)) {
                        count++;
                    }
                }
            }
        }

        // Each rectangle is counted twice (two diagonals), so divide by 2
        return count / 2;
    }

    public static void main(String[] args) {
        CountRectangles sol = new CountRectangles();
        int[] A = {1, 1, 4, 4};  // x-coordinates
        int[] B = {1, 4, 1, 4};  // y-coordinates
        System.out.println("Total rectangles: " + sol.countRectangles(A, B));
    }
}
