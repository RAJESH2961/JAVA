import java.util.Stack;

public class MergeTwoSortedStack {

    public static Stack<Integer> mergeSortedStack(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> merged = new Stack<>();

        // Merge in descending order (largest elements on top)
        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.peek() > s2.peek()) {
                merged.push(s1.pop());
            } else {
                merged.push(s2.pop());
            }
        }

        // Push remaining elements from s1
        while (!s1.isEmpty()) {
            merged.push(s1.pop());
        }

        // Push remaining elements from s2
        while (!s2.isEmpty()) {
            merged.push(s2.pop());
        }

        // Reverse to make ascending order (smallest at bottom, largest at top)
        return reverse(merged);
    }

    // Helper function to reverse a stack
    public static Stack<Integer> reverse(Stack<Integer> stack) {
        Stack<Integer> reversed = new Stack<>();
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
        return reversed;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        Stack<Integer> s2 = new Stack<>();
        s2.push(15);
        s2.push(22);
        s2.push(35);
        s2.push(45);

        Stack<Integer> result = mergeSortedStack(s1, s2);

        // Print merged sorted stack
        System.out.println("Merged Sorted Stack (top to bottom):");
        while (!result.isEmpty()) {
            System.out.print(result.pop()+",");
        }
    }
}
