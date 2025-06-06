class Node {
    int data;
    Node next;
    Node(int data1) {
        data = data1;
    }
}

// Main function
public class InsertValInSortedOrder {

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

    // Inserting kth value at sorted position
    private static Node insertSortedPosition(Node head, int k){
        // 3 edge cases 
        // edge-1 if head is null

        if( head == null ) {
            return new Node(k);
        }
        // if i want to insert before at head
        if(k < head.data) {
            return new Node(k).next = head;
        }
        // traversing the temp until tje condition mets
        // temp.next.data < k
        // move the temp so that we can stay before the exact position 
        Node temp = head;
        while(temp.next.data < k && temp.next!=null){// &&-> last prev element
            // If we dont put the && then temp.next.null < k --> NULL POINTER EXCEPTION
            temp = temp.next;
        }
        // Linking the connection
        Node newNode = new Node(k);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
    public static void main(String[] args) {
        // System.err.println("test");

        int arr[] = {2, 3, 4, 23};

        Node head = array2LL(arr);
        printLL(head);
        int value = 13;
        head = insertSortedPosition(head, value);
        printLL(head);
    }
}
