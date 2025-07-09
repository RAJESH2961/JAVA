
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagramBrute(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    int[] countS1 = new int[26];
    int[] countS2 = new int[26];

    for (int i = 0; i < s1.length(); i++) {
        countS1[s1.charAt(i) - 'a']++;
        countS2[s2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
        if (countS1[i] != countS2[i]) return false;
    }

    return true;
    }

    public static boolean isAnagramBetter(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static boolean isAnagramOptimal(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26]; // assuming lowercase a-z

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramBetter("listen", "silent")); // true
        System.out.println(isAnagramBrute("listen", "silent")); // true
        System.out.println(isAnagramOptimal("listen", "silent")); // true
    }
}
