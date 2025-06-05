class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseLL {

    // Printing the Linked List
    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    // Converting array to doubly Linked List
    private static Node Arr2Dll(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // Reversing an Doubly linked list
    private static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        return temp.prev;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 2, 3, 4, 5 };
        Node head = Arr2Dll(arr);
        printLL(head);
        // System.out.println(head.prev);
        // System.out.println(head.next);
        // System.out.println(head.next.next.prev);
        Node reversedHead = reverseLL(head);
        printLL(reversedHead);
    }
}