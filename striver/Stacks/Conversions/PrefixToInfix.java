import java.util.Stack;

/**
 * Utility class to convert prefix expressions to infix notation.
 */
public class PrefixToInfix {


    /**
     * Checks if the given character is a valid operand (letter or digit).
     *
     * @param c character to check
     * @return true if it's a letter or digit, false otherwise
     */
    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    /**
     * Converts a prefix expression to an infix expression.
     *
     * @param expression the prefix expression as a string
     * @return the corresponding infix expression
     * @throws IllegalArgumentException if the input is not a valid prefix expression
     */
    public static String convert(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Input expression cannot be null or empty.");
        }

        Stack<String> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            if (isOperand(c)) {
                stack.push(String.valueOf(c));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid prefix expression: insufficient operands.");
                }
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String combined = "(" + operand1 + c + operand2 + ")";
                stack.push(combined);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid prefix expression: leftover operands.");
        }

        return stack.pop();
    }

    /**
     * Main method to test the conversion.
     */
    public static void main(String[] args) {
        String input = "*+pq-mn";
        try {
            String infix = convert(input);
            System.out.println("Infix expression: " + infix);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
