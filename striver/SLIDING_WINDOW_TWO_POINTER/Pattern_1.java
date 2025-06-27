/**
 * Pattern_1 - Sliding Window Pattern Example
 *
 * This class demonstrates three approaches to solving the problem of finding
 * the length of the longest contiguous subarray with a sum less than or equal to a given value `k`.
 * 
 * Approaches implemented:
 * 1. Brute Force - O(n^2)
 * 2. Better (Sliding Window with condition check) - O(n)
 * 3. Optimal (Cleaner Sliding Window) - O(n)
 *
 * Example:
 * Input: arr = {2, 5, 1, 7, -2, 2, 10}, k = 14
 * Output: Length of longest subarray with sum <= 14 is 5
 */
public class Pattern_1 {

    /**
     * Brute Force Approach: Generate all subarrays and check their sums.
     * Time Complexity: O(n^2)
     *
     * @param arr Input array of integers
     * @param k Maximum allowed sum for a subarray
     * @return Length of the longest subarray with sum <= k
     */
    public static int bruteForce(int arr[], int k) {
        int maxLength = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum <= k) {
                    maxLength = Math.max(maxLength, (j - i + 1));
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }

    /**
     * Better Approach: Sliding Window with two pointers.
     * Expand window until sum > k, then shrink from the left.
     * Time Complexity: O(n)
     *
     * @param arr Input array of integers
     * @param k Maximum allowed sum for a subarray
     * @return Length of the longest subarray with sum <= k
     */
    public static int better(int arr[], int k) {
        int maxLength = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum <= k) {
                maxLength = Math.max(maxLength, (right - left + 1));
            }
            right++;
        }
        return maxLength;
    }

    /**
     * Optimal Approach: Clean two-pointer technique using while loop and condition checks.
     * Ensures all valid windows are considered efficiently.
     * Time Complexity: O(n)
     *
     * @param arr Input array of integers
     * @param k Maximum allowed sum for a subarray
     * @return Length of the longest subarray with sum <= k
     */
    public static int optimal(int arr[], int k) {
        int maxLength = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            
            while (sum > k && left <= right) {
            // left <= right
            // This is a safety check to make sure you don’t overshrink the window or go out of bounds.
            // Imagine a case like:
            // left = 4, right = 4
            // sum = 16, k = 10
                sum -= arr[left];
                left++;
            }
            if (sum <= k) {
                maxLength = Math.max(maxLength, (right - left + 1));
            }
            right++;
        }
        return maxLength;
    }

    /**
     * Main method to test all three approaches.
     * Example Input: {2, 5, 1, 7, -2, 2, 10}, k = 14
     */
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, -2, 2, 10};
        int k = 14;
        System.out.println("Brute Force Approach : " + bruteForce(arr, k));
        System.out.println("Better Approach : " + better(arr, k));
        System.out.println("Optimal Approach : " + optimal(arr, k));
    }
}
