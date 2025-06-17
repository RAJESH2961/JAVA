import java.util.Stack;

public class PostFixToPrefix {

    /**
     * utility fucntion to check wheather it is operand or not
     * @param c is an character to check
     * @return true if it is operand, false otherwise
     */

    static boolean isOperand(char c){
        return Character.isLetterOrDigit(c);
    }
    /**
     * 
     * @param expression
     * @return top of the stack
     */

    public static String postfixToPrefix(String expression){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(isOperand(c)){
                stack.push(String.valueOf(c));
            } else {
                String operator1 = stack.pop();
                String operator2 = stack.pop();
                String combined = c + operator2 + operator1;
                stack.push(combined);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        System.out.println(postfixToPrefix(postfix));

    }
}
