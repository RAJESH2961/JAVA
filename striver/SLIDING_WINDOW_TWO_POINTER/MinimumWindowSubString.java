public class MinimumWindowSubString {
    public static String brute(String s, String t) {
        String MaxStr = "";
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            int hash[] = new int[256];
            int cnt = 0; // move cnt inside the outer loop to reset

            // Build hash from t
            for (int j = 0; j < t.length(); j++) {
                hash[t.charAt(j)]++; // FIXED: was s.charAt(j)
            }

            // Inner loop to scan s starting from i
            for (int j = i; j < s.length(); j++) { // FIXED: should start from i
                if (hash[s.charAt(j)] > 0) {
                    hash[s.charAt(j)]--;
                    cnt++; // FIXED: increment when char matched
                }

                if (cnt == t.length()) {
                    if (j - i + 1 < minLen) {
                        minLen = j - i + 1;
                        sIndex = i;
                    }
                    break;
                }
            }

            // FIXED: moved after if block to avoid substring with invalid sIndex
            if (sIndex != -1) {
                MaxStr = s.substring(sIndex, sIndex + minLen);
            }
        }

        return MaxStr;
    }
    public static String optimal(String s, String t) {
        String MaxStr = "";
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        int[] hash = new int[128];
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        int cnt = t.length();
        int left = 0;

        for (int j = 0; j < s.length(); j++) {
            if (hash[s.charAt(j)] > 0) {
                cnt--;
            }
            hash[s.charAt(j)]--;

            while (cnt == 0) {
                if (j - left + 1 < minLen) {
                    minLen = j - left + 1;
                    sIndex = left;
                }

                hash[s.charAt(left)]++;
                if (hash[s.charAt(left)] > 0) {
                    cnt++;
                }
                left++;
            }
        }

        if (sIndex != -1) {
            MaxStr = s.substring(sIndex, sIndex + minLen);
        }

        return MaxStr;
    }

    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";
        System.out.println("Brute Force : " + brute(s, t));
        System.out.println("Optimal : " + optimal(s, t));
    }
}
