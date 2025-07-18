import java.util.*;

public class RightAngledTriangles {

    public static void main(String[] args) {
        int[] A = {1, 4, 8, 8, 1}; // x-coordinates
        int[] B = {4, 4, 4, 1, 1}; // y-coordinates
        int n = A.length;

        // Maps to count occurrences of each x and y coordinate
        Map<Integer, Integer> xCount = new HashMap<>();
        Map<Integer, Integer> yCount = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            xCount.put(A[i], xCount.getOrDefault(A[i], 0) + 1);
            yCount.put(B[i], yCount.getOrDefault(B[i], 0) + 1);
        }

        int totalTriangles = 0;

        // For each point, calculate triangles with it as the right angle
        for (int i = 0; i < n; i++) {
            int cx = xCount.get(A[i]) - 1; // other points with same x
            int cy = yCount.get(B[i]) - 1; // other points with same y
            totalTriangles += cx * cy;
        }

        System.out.println("Total right-angled triangles: " + totalTriangles);
    }
}
