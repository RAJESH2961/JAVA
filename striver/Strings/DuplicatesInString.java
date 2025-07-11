import java.util.HashMap;
// https://www.scaler.com/topics/duplicate-characters-in-a-string-java/
public class DuplicatesInString {

    public static String optimal(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Build result string with duplicates
        StringBuilder result = new StringBuilder();
        for (char c : hm.keySet()) {
            if (hm.get(c) > 1) {
                result.append(c).append(":").append(hm.get(c)).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "aabcdedd";
        String duplicates = optimal(s);
        System.out.println("Duplicates: " + duplicates);  // Output: a:2 d:3
    }
}
