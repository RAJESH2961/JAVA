public class ValidPalindrome {

    // ✅ Brute Force Method
    public static boolean isPalindromeBrute(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.toString().equals(reversed);
    }

    // ✅ Optimal Method (Two-Pointer)
    public static boolean isPalindromeOptimal(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // ✅ Main method to test both approaches
    public static void main(String[] args) {
        String[] testCases = {
            "A man, a plan, a canal: Panama",
            "race a car",
            "No lemon, no melon",
            "Was it a car or a cat I saw?",
            "12321",
            "",
            " "
        };

        for (String test : testCases) {
            System.out.println("Testing: \"" + test + "\"");
            System.out.println("Brute Force: " + isPalindromeBrute(test));
            System.out.println("Optimal:     " + isPalindromeOptimal(test));
            System.out.println();
        }
    }
}
