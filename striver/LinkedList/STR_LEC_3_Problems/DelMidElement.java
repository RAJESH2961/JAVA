class Node {
     int val;
     Node next;
     Node() {}
     Node(int val) { this.val = val; }
     Node(int val, Node next) { this.val = val; this.next = next; }
 }
 
public class DelMidElement {

    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node deleteMiddle(Node head) {
        // This method is done by remembering Previous element
        /*
        // Edge cases 
        // If there is only one element
        if(head == null || head.next == null) {
            return null;
        }
        
        Node fast = head;
        Node slow = head;
        // handling prev node
        Node prev = null;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
        // changint links
        // Delete the middle node
        prev.next = slow.next;
        */

        // This method is done by skipping slow one step
        if(head == null || head.next == null) {
            return null;
        }
        
        Node fast = head;
        Node slow = head;
        // skip 1 step
        fast = fast.next.next;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            // prev = slow;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Display the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle node
        Node newhead = deleteMiddle(head);

        // Displaying the updated linked list
        System.out.print("Updated Linked List: ");
        printLL(newhead);
    }
}