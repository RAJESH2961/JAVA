public class BinarySubarrayWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        // (Number of subarrays with sum ≤ goal) - (Number of subarrays with sum ≤ goal-1)
        return helper(nums, goal) - helper(nums, goal - 1);
    }
    
    
    private static int helper(int[] nums, int x) {
        // Edge case: no subarrays can have negative sum
        if (x < 0) return 0;
        
        int res = 0;        // Result counter
        int left = 0;       // Left pointer of sliding window
        int currentSum = 0; // Current sum of window
        
        // Expand the window by moving right pointer
        for (int right = 0; right < nums.length; right++) {
            // Add current element to the window sum
            currentSum += nums[right];
            
            // Shrink the window from left if sum exceeds x
            while (currentSum > x) {
                currentSum -= nums[left];
                left++;
            }
            
            // All subarrays ending at right with sum ≤ x
            // Count is window size (right - left + 1)
            res += (right - left + 1);
        }
        
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,1,1};
        int k = 2;
        System.out.println(numSubarraysWithSum(arr,k));
    }
}
