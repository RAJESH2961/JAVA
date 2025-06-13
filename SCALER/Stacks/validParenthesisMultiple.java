import java.util.Stack;

class validParenthesisMultiple {
    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                // char top = st.pop();
                if((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{') || (c == ']' && st.peek() == '[') ){
                    // return false;
                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("({{]{}}})"));
    }
} 
