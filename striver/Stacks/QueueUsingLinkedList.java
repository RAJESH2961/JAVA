class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class queueImplementation{
    Node start,end = null;
    int size = 0;
    // Push operation
    void push(int data) {
        Node temp = new Node(data);
        if(start == null) {
            start = temp;
            end = temp;
        } else {
            end.next = temp;
            end = temp;
        }
        size++;
    }

    // pop operation
    void pop(){
        if(size == 0){
            System.out.println("No elements in the queue");
        }
        else {
            start = start.next;
            size--;
        }
    }
    // size Opearation
    int getSize(){
        if(size == 0){
            System.out.println("No elements in the queue");
        }
        return size;
    }
    // top --> returns the start/head
    int top(){
        if(size == 0){
            System.out.println("stack underflow");
        }
        return start.data;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        queueImplementation qus = new queueImplementation();
        qus.push(10);
        qus.push(20);
        qus.push(30);
        System.out.println("Size of the queue : "+ qus.getSize()); // 3

        qus.pop();
        qus.pop();
        System.out.println("Size of the queue : "+ qus.getSize()); // 1
        qus.pop();
        System.out.println("Size of the queue : "+ qus.getSize()); // 0
        qus.pop();
        // System.out.println("Top element"+qus.top());
    }
}
