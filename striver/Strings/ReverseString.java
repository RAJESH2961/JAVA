public class ReverseString {

    // Brute force
    public static String reverseBrute(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    // Better using StringBuilder
    public static String reverseBetter(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Optimal using character array and two pointers
    public static String reverseOptimal(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // Test all versions
    public static void main(String[] args) {
        String input = "hello";

        System.out.println("Original: " + input);
        System.out.println("Brute: " + reverseBrute(input));
        System.out.println("Better: " + reverseBetter(input));
        System.out.println("Optimal: " + reverseOptimal(input));
    }
}
