import java.util.Stack;

class QueueImplementation {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
    
    public void push(int x){
        while(!input.empty()){
            output.push(input.pop());
        }
        input.push(x);
        while(!output.empty()){
            input.push(output.pop());
        }
    }

    public int pop() {
        if (input.empty()) throw new RuntimeException("Queue is empty");
        return input.pop();
    }

    public int peek() {
        if (input.empty()) throw new RuntimeException("Queue is empty");
        return input.peek();
    }

    public boolean empty() {
        return input.empty();
    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation();
        q.push(10);
        q.push(20);
        System.out.println(q.peek());  // 10
        System.out.println(q.pop());   // 10
        System.out.println(q.empty()); // false
    }
}
