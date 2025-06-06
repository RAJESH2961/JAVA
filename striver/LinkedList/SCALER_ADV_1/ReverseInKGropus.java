class Node {
    int data;
    Node next;
    Node(int data1) {
        data = data1;
    }
}

// Main function
public class ReverseInKGropus{

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

    private static Node reverseKNodesGroups(Node head, int k) {
        // Edge cases
        if(k == 0 || head == null || k == 1){
            return head;
        }
        Node head2 = null;
        Node head1 = head;
        Node temp = head1;
        int count = k;
        while(head1 != null && k>0) {
            k--;
            temp = head1;
            head1 = head1.next;
            temp.next = head2;
            head2 = temp;
        }
        head.next = reverseKNodesGroups(head1, count);
        return head2;
    }
    public static void main(String[] args) {
        // System.err.println("test");

        int arr[] = {2, 3, 4, 23,45};

        Node head = array2LL(arr);
        printLL(head);
        int k = 3;
        Node reversedHead = reverseKNodesGroups(head,k);
        printLL(reversedHead);

    }
}

    

