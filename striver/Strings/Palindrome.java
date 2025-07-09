public class Palindrome {

    // 1. Brute Force: Reverse using string concatenation (inefficient)
    public static boolean isPalindromeBrute(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Inefficient for large strings
        }
        return s.equals(reversed);
    }

    // 2. Better: Reverse using StringBuilder (efficient)
    public static boolean isPalindromeBetter(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        return s.equals(reversed);
    }

    // 3. Optimal: Two-pointer approach (most efficient)
    public static boolean isPalindromeOptimal(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // Main method to test all three versions
    public static void main(String[] args) {
        String input = "racecar";
        String input2 = "hello";

        System.out.println("Testing with: " + input);
        System.out.println("Brute: " + isPalindromeBrute(input));
        System.out.println("Better: " + isPalindromeBetter(input));
        System.out.println("Optimal: " + isPalindromeOptimal(input));

        System.out.println("\nTesting with: " + input2);
        System.out.println("Brute: " + isPalindromeBrute(input2));
        System.out.println("Better: " + isPalindromeBetter(input2));
        System.out.println("Optimal: " + isPalindromeOptimal(input2));
    }
}
