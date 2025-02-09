/**
 * This program computes three types of prefix sum arrays:
 * 1. `prefix[]`  - Standard prefix sum of the given array.
 * 2. `preE[]`    - Prefix sum of elements at even indices.
 * 3. `preO[]`    - Prefix sum of elements at odd indices.
 */
public class PrefixSum {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Prefix Sum Array: Stores cumulative sum of all elements from index 0 to i
        int[] prefix = new int[n];
        prefix[0] = arr[0]; // Initialize first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // Add previous sum with current element
        }

        // Prefix Sum Array for Even Indices: Stores cumulative sum of elements at even indices
        int[] preE = new int[n];
        preE[0] = arr[0]; // First element remains the same
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) { // If index is odd, carry forward the previous sum
                preE[i] = preE[i - 1];
            } else { // If index is even, add the current element to the sum
                preE[i] = preE[i - 1] + arr[i];
            }
        }

        // Prefix Sum Array for Odd Indices: Stores cumulative sum of elements at odd indices
        int[] preO = new int[n];
        preO[0] = 0; // No odd indices before index 0, so initialize with 0
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) { // If index is even, carry forward the previous sum
                preO[i] = preO[i - 1];
            } else { // If index is odd, add the current element to the sum
                preO[i] = preO[i - 1] + arr[i];
            }
        }

        // Printing the standard prefix sum array
        System.out.println("Prefix Sum Array:");
        for (int data : prefix) {
            System.out.print(data + " ");
        }
        System.out.println();

        // Printing the prefix sum array for even indices
        System.out.println("Prefix Sum Array for Even Indices:");
        for (int data : preE) {
            System.out.print(data + " ");
        }
        System.out.println();

        // Printing the prefix sum array for odd indices
        System.out.println("Prefix Sum Array for Odd Indices:");
        for (int data : preO) {
            System.out.print(data + " ");
        }
    }
}
