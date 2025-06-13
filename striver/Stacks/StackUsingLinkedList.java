class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class StackImplementation {
    Node top = null; // No dummy node
    int size = 0;

    void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        size++;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        top = top.next;
        size--;
    }

    int size() {
        return size;
    }

    int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackImplementation st = new StackImplementation();
        st.push(12);
        st.push(2);
        st.push(22);
        st.push(11);

        System.out.println(st.size()); // 4
        System.out.println(st.top());  // 11

        st.pop(); // remove 11
        st.pop(); // remove 22
        st.pop(); // remove 2

        System.out.println(st.top());  // 12
        System.out.println(st.size()); // 1

        st.pop(); // remove 12
        st.pop(); // Should print "Stack Underflow"
        System.out.println(st.top());  // Should print "Stack is empty"
    }
}
