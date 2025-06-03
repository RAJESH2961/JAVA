class Node {
    int data;
    Node next;
    // Constructor
    // Node(int data1, Node next1){
    //     this.data = data1;
    //     this.next = next1;
    // }

    Node(int data1){
        this.data = data1;
    }
}

public class CreateLL{
    public static void main(String[] args) {
        // int arr[] = {2, 5, 6, 8};
        Node x = new Node(4);
        System.out.println(x.data);
        System.out.println(x.next);
    }
}