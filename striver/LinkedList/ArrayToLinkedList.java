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

public class ArrayToLinkedList {
    private static Node convertArr2LL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int countLength(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        System.out.println("Head Data :"+ head.data);
        // Traversing an Linked List
        Node temp = head;
        System.out.println(temp.next);

        while(temp != null) {
            // System.out.println(temp);
            System.out.println(temp+ " "+temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp);


        // Length of the Linked List
        System.out.println("Count is "+ countLength(head));
        System.out.println("Head is "+ arr[0]);
    }
}