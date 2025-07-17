import java.util.Arrays;
import java.util.HashSet;

public class LongestSequence {
    public static int brute(int arr[]) {
        Arrays.sort(arr); // Step 1: Sort array
        int cnt = 1;       // Count current sequence length
        int maxCnt = 1;    // Store maximum sequence length

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Ignore duplicates
                continue;
            }
            if (arr[i] - arr[i - 1] == 1) {
                cnt++; // Consecutive number found
            } else {
                cnt = 1; // Sequence broken
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }

    // Optimal Approach
    public static int optimal(int[] arr) {
    HashSet<Integer> hs = new HashSet<>();
    
    // Step 1: Insert all elements into the HashSet
    for (int num : arr) {
        hs.add(num);
    }

    int maxLen = 0;

    // Step 2: Try to build a sequence from each number that is a sequence start
    for (int num : hs) {
        // Only check for the start of a sequence
        if (!hs.contains(num - 1)) {
            int curNum = num;
            int curLen = 1;

            // Continue the sequence
            while (hs.contains(curNum + 1)) {
                curNum++;
                curLen++;
            }

            maxLen = Math.max(maxLen, curLen);
        }
    }

    return maxLen;
}


    public static void main(String[] args) {
        int arr[] = {9, 4, 8, 8, 11, 15, 13, 6, 7, 6, 12};
        System.out.println("Brute : " + brute(arr));  // Output: 5 → [11,12,13,14,15]
        System.out.println("Optimal : " + optimal(arr));  // Output: 5 → [11,12,13,14,15]
    }
}
