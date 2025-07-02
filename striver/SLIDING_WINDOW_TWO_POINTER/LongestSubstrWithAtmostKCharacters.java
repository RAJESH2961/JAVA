
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstrWithAtmostKCharacters {

    public static int brute(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.clear();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                if (hm.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break; // More than k distinct chars, break inner loop
                }
            }
        }
        return maxLen;
    }

    public static int brute1(String s, int k) {
        int maxLen = 0;
        HashSet<Character> hm = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            hm.clear();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                hm.add(ch);

                if (hm.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break; // More than k distinct chars, break inner loop
                }
            }
        }
        return maxLen;
    }

    public static int optimal(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            // Add Elements to hashmap
            hm.put(rightChar, hm.getOrDefault(rightChar, 0)+1); // Remove characters from hashmap 
            while (hm.size() > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);

                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;
            }
            if (hm.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // ()
       
        right++;
         }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaabbbcccd";
        int k = 2;
        System.out.println("Longest Substring with at most " + k + " characters: " + brute(s, k));
        System.out.println("Longest Substring with at most " + k + " characters: " + brute1(s, k));
        System.out.println("Longest Substring with at most " + k + " characters: " + optimal(s, k));
    }
}
