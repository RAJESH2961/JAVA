// package SCALER_ADV_3;


class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class deepCopy{
        // creating a deep copy
        private static Node deepCopy(Node head) {
            Node newHead = new Node(head.data);
            Node currentOrigional = head.next;
            Node currentCopy = newHead;
            while (currentOrigional != null) {
            currentCopy.next = new Node(currentOrigional.data);
            // Moving both the pointers
            currentCopy = currentCopy.next;
            currentOrigional = currentOrigional.next;
        }
            return newHead;
        }

    public static void main(String[] args) {
        // Creating 5 nodes with data
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Printing the list
        Node current = head;
        System.out.println("Origional address :"+current);
        System.out.println("Deepnode address :"+deepCopy(current));

        // Printing memory address of the origional node head
        // System.out.println(current);
    }
}
