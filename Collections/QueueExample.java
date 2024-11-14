import java.util.*;

public class QueueExample {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // we cant create object for Queue becaue queue is an Interface
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("First Element is :"+q.peek());
        System.out.println("Removed Element is "+q.poll());
        System.out.println("First Element is :"+q.peek());
        System.err.println(q);


        //Queue is interface but PriorityQueue, ArrayDeque is class 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(10);
        pq.add(10);
        pq.add(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        // pq.isEmpty();
        pq.remove();//Removes First Element
        // pq.removeAll(pq);//Removes All Elements in An array
        System.out.println("Does Queue is Empty : "+ pq.isEmpty());
        pq.peek();
        System.out.println("Peek ELement" +pq.peek());
        System.err.println(pq);

        //Double Ended Queue
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(10);
        dq.add(10);
        dq.add(10);
        dq.add(10);
        dq.addLast(100);
        dq.removeLast();

        //Array Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.addFirst(20);


    }
}
