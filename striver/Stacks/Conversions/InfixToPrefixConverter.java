import java.util.*;

public class InfixToPrefixConverter {

    // Check if a character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Define precedence of operators
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // Right-associativity only for '^'
    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    // Check if character is operand (letter or digit)
    static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    // Step 1: Reverse the input and swap '(' with ')'
    static String reverseAndSwapBrackets(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') reversed.append(')');
            else if (c == ')') reversed.append('(');
            else reversed.append(c);
        }
        return reversed.toString();
    }

    // Step 2: Convert infix to postfix
    static String infixToPostfix(String exp) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (isOperand(c)) {
                output.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // pop '('
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && isOperator(stack.peek())) {
                    char top = stack.peek();
                    if ((precedence(c) < precedence(top)) ||
                        (precedence(c) == precedence(top) && !isRightAssociative(c))) {
                        output.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    // Step 3: Reverse postfix to get prefix
    static String infixToPrefix(String infix) {
        String reversed = reverseAndSwapBrackets(infix);          // Step 1
        String postfix = infixToPostfix(reversed);                // Step 2
        return new StringBuilder(postfix).reverse().toString();   // Step 3
    }

    public static void main(String[] args) {
        // Change this expression to test others
        String infix = "a^b^c";
        System.out.println("Infix Expression: " + infix);
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}
