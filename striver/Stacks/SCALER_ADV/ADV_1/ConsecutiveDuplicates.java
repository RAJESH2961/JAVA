import java.util.Stack;

public class ConsecutiveDuplicates {
// You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string. 

// Example:

// Input: s = "aabb"
// Output:  "ab" 
// Explanation: 
// The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.
// Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed.
// The final string is "ab".
    public static String removeConsecutiveCharacter(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            // Append current character only if it's not same as the previous one
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }

    // Another type of prpblem
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && current == stack.peek()) {
                stack.pop(); // Remove duplicate
            } else {
                stack.push(current); // Add new char
            }
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String data = "aabbccddeee";
        System.out.println("Type : 1 - "+removeConsecutiveCharacter(data));
        System.out.println("Type : 2 - "+removeDuplicates(data));

    }
}
