import java.util.ArrayList;
import java.util.HashMap;

public class SingleNumberThrice {
    public static void main(String[] args) {
        // Brute Force Approach
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(10);
        nums.add(1);
        nums.add(20);
        nums.add(20);
        nums.add(20);

        // Map to store occurrences
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Count occurrences of numbers
        for (int num : nums) {  // FIX: Use num instead of index i
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // Find and print the unique number
        for (int key : mpp.keySet()) {
            if (mpp.get(key) == 1) {
                System.out.println("Single Number (HashMap): " + key);
            }
        }

        // Optimal Solution using Bitwise Operations
        int ans = 0;

        // Iterate through each bit position (0 to 31)
        for (int bitIndex = 0; bitIndex <= 31; bitIndex++) {
            int cnt = 0;

            // Count how many numbers have this bit set
            for (int num : nums) {
                if ((num & (1 << bitIndex)) != 0) { // Check if bit is set
                    cnt++;
                }
            }

            // If count is not a multiple of 3, this bit belongs to the unique number
            if (cnt % 3 != 0) {
                ans |= (1 << bitIndex); // Set this bit in the result
            }
        }

        System.out.println("Single Number (Bitwise): " + ans);
    }
}
