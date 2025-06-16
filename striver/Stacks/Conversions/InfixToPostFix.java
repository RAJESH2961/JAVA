import java.util.Stack;

public class InfixToPostFix {

    // Method to return precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+': case '-':
                return 1;
            case '*': case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Method to convert infix to postfix
    static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            // If operand, add to result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')', pop until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // If operator
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if (c == '^' && stack.peek() == '^') break; // right-associative case
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }
}
