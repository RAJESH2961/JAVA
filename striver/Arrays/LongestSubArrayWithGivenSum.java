import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static int brute(int arr[], int target) {
        int maxLen = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j]; // Add arr[j] to the current subarray sum
                if (sum == target) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static int optimal1(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1); // sum 0 occurs at index -1
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // Check if (sum - k) exists
            if (prefixSum.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSum.get(sum - k));
            }
            
            // Store the earliest occurrence of this sum
            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
        }
        return maxLen;
    }

    public static int mostOptimal(int[] arr, int k) {
    int left = 0, right = 0;
    int maxLen = 0;
    int sum = 0; // Initialize sum to 0

    while (right < arr.length) {
        sum += arr[right]; // Expand the window by adding arr[right]

        // Shrink the window if sum exceeds k
        while (sum > k) {
            sum -= arr[left];
            left++;
        }

        // Check for valid subarray
        if (sum == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }

        right++; // Move the right pointer
    }
    return maxLen;
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 1, 1, 1, 1};
        int k = 6;
        System.out.println("Brute Force: " + brute(arr, k));
        System.out.println("optimal Approach: " + optimal1(arr, k));
        System.out.println("optimal Approach 2: " + mostOptimal(arr, k));
    }
}