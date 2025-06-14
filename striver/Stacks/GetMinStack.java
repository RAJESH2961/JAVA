import java.util.Stack;

class Pair {
    int first, second;
    // Constructor
    Pair(int f, int s) {
        this.first = f;
        this.second = s;
    }
}

class GetMinImplementation {
    Stack<Pair> st = new Stack<>();

    public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x;
        } else {
            min = Math.min(st.peek().second, x);
        }
        st.push(new Pair(x, min));
        // System.out.println(st.push(new Pair(x, min)).first);
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        return st.peek().first;
    }

    public int getMin() {
        return st.peek().second;
    }
}

public class GetMinStack {
    public static void main(String[] args) {
        GetMinImplementation minStack = new GetMinImplementation();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);
        System.out.println("Current Min: " + minStack.getMin()); // Should print 1
        minStack.pop();
        System.out.println("Top Element: " + minStack.top());    // Should print 2
        System.out.println("Current Min: " + minStack.getMin()); // Should print 2
    }
}
