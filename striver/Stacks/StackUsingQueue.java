
import java.util.LinkedList;
import java.util.Queue;

class Stack{
    Queue<Integer> q = new LinkedList<>();

    void push(int data){
        q.add(data);
        // replacing previous Elements 
        for(int i = 1; i<=q.size(); i++){
            q.add(q.remove());
        }
    }
    void pop(){
        q.remove();
    }
    int top(){
        return q.peek();
    }
    int size(){
        return q.size();
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        System.out.println("Stack Size :"+s.size());
    }
}
