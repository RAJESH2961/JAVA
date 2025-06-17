import java.util.Stack;

public class PostFixToInfix {
    /**
     * utility function to check the given operand 
     * @param c characteer to check
     * @return Returns true if it an character or digit False otherwise
     */

    // Utility function to check if character is operand
    static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    // Convert Postfix to Infix
    public static String postFixToInfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOperand(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expr = "(" + op2 + c + op1 + ")";
                stack.push(expr);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab-de+f*/";
        System.out.println("Postfix: " + postfix);
        String infix = postFixToInfix(postfix);
        System.out.println("Infix: " + infix);
    }
}
