import java.util.Stack;

public class SimplifyDirectoryPath {
    private static String SimplifyPath(String A) {
        Stack<String> stack = new Stack<>();
        String[] parts = A.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Ignore empty or current directory
                continue;
            } else if (part.equals("..")) {
                // Go up to parent directory if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name
                stack.push(part);
            }
        }

        // Reconstruct the path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        // If stack was empty, return "/"
        return result.length() == 0 ? "/" : result.toString();
    }
    public static void main(String[] args) {
        String input = "/a/./b/..//../c/";
        System.out.println(SimplifyPath(input));
    }
}
