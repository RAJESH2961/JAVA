class Node {
    int data;
    Node next;
    Node(int data1) {
        data = data1;
    }
}

// Main function
public class ReverseSingleLL {

    // Converting array to Linked List and returning head
    private static Node array2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Printing the Linked List
    private static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ ",");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node reverseLinkedList(Node head) {
        Node head2 = null;
        Node head1 = head;
        Node temp = head1;
        while(head1 != null) {
            temp = head1;
            head1 = head1.next;
            temp.next = head2;
            head2 = temp;
        }
        return head2;
    }
    public static void main(String[] args) {
        // System.err.println("test");

        int arr[] = {2, 3, 4, 23};

        Node head = array2LL(arr);
        printLL(head);

        Node reversedHead = reverseLinkedList(head);
        printLL(reversedHead);

    }
}

