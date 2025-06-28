public class LongestSubStrWithoutRepeatingCharacters {
    public static int bruteForce(String s) {
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int[] hashmap = new int[256]; // ASCII character set
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (hashmap[ch] == 1) {
                    // Internally char is stored as ASCII
                    // hashmap['a'] == 1;
                    // hashmap[97] ==1;
                    break; // Duplicate character found
                }
                hashmap[ch] = 1;
                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen == Integer.MIN_VALUE ? 0 : maxLen; // In case input is empty
    }
    // Optimal Approach
    public static int optimalApproach(String s) {
    int maxLen = 0;
    int[] hashMap = new int[256];  // ASCII character set

    // Initialize all elements to -1 (means not seen yet)
    for (int i = 0; i < 256; i++) {
        hashMap[i] = -1;
    }

    int left = 0;
    int n = s.length();

    for (int right = 0; right < n; right++) {
    char c = s.charAt(right);

        // If character seen and is in current window
        if (hashMap[c] >= left) {
            left = hashMap[c] + 1;
        }

        // Update last seen index of the character
        hashMap[c] = right;

        // Update max length
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}


    public static void main(String[] args) {
        String str = "cadbzabcd";
        System.out.println("Longest substring without repeating characters Brute force: " + bruteForce(str));
        System.out.println("Longest substring without repeating characters optimal Approach: " + optimalApproach(str));
    }
}
