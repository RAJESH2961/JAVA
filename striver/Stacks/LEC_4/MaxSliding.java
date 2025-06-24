import java.util.*;

class MaxSliding {
    public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1]; // Result array
        int ri = 0;                   // Result index tracker
        
        Deque<Integer> q = new ArrayDeque<>(); // Stores indices of elements
        
        for (int i = 0; i < n; i++) {

            // Remove out-of-range elements
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }

            // Remove smaller elements
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            // Add current element's index
            q.offer(i);

            // Store result once first k elements are processed
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }

        return r;
    }

    public static void main(String[] args) {
        int arr[] = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;
        int ans[] = maxSlidingWindow(arr, k);

        System.out.println("Maximum element in every " + k + " window: ");
        for (int val : ans)
            System.out.print(val + "  ");
    }
}
