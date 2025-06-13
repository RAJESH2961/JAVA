import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(())";  // Example input
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    System.out.println("Not a valid expression");
                    return; // Early exit on mismatch
                } else {
                    st.pop();
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Not a valid expression");
        }
    }
}
