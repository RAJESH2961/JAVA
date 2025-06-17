import java.util.Stack;
public class PrefixToPostFix {

    static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }

    private static String PrefixToPostFix(String expression) {
        // Stack to store elements
        Stack<String> stack = new Stack<>();

        // push it to stack if it is operand
        // Itearte from reverse 
        for(int i = expression.length()-1; i>=0; i--){
            char ch = expression.charAt(i);
            if(isOperand(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String combined = operand1 + operand2 + ch;

                stack.push(combined);
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix = "/-AB*+DEF";
        System.out.println(PrefixToPostFix(prefix));
    }
}
