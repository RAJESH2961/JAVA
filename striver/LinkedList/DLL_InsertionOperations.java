
class Node {

    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DLL_InsertionOperations {

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

    // Deleting Head in LinkedList
    private static Node delHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    // Deleting Head in LinkedList
    private static Node delTail(Node head) {
        // Edge cases
        if (head == null || head.next == null) {
            return null;
        }
        // Node temp = head;
        // Moving to last previous
        // while(temp.next.next != null){
        //     temp = temp.next;
        // }
        // temp.next.back = null;
        // temp.next = null;
        // return head;

        // OR
        Node tail = head;
        // move to last
        while (tail.next != null) {
            tail = tail.next;
        }
        // Last previous one
        Node prevNode = tail.back;
        prevNode.next = null;
        tail.back = null;
        return head;
    }

    // Deleting Kth Node
    private static Node delKthNode(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        int cnt = 1;
        Node kNode = head;

        // Step 1: Go to the k-th node
        while (cnt < k && kNode != null) {
            kNode = kNode.next;
            cnt++;
        }

        // Check if kNode is null (k > length)
        // if (kNode == null) return head;
        Node prevNode = kNode.back;
        Node nextNode = kNode.next;

        // Case 1: Only one node
        if (prevNode == null && nextNode == null) {
            return null;
        }

        // Case 2: Deleting head
        if (prevNode == null) {
            nextNode.back = null;
            kNode.next = null;
            return nextNode;
        }

        // Case 3: Deleting tail
        if (nextNode == null) {
            prevNode.next = null;
            kNode.back = null;
            return head;
        }

        // Case 4: Middle node
        prevNode.next = nextNode;
        nextNode.back = prevNode;
        kNode.next = null;
        kNode.back = null;

        return head;
    }

    // deleting an Node
    // PS An node will be given we need to remove that node from an doubly linked list
    // Node != head constrain given node will never be head
    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null) {
            front.back = null;
            temp.next = null;
            return;
        }

        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }

        prev.next = front;
        front.back = prev;
        temp.back = temp.next = null;

    }

    // INSERTION OPERATIONS
    private static Node insertBeforeHead(Node head, int value) {
        // Create a NEW node
        Node temp = new Node(value);
        head.back = temp;
        temp.next = head;

        return temp;

    }

    // Insert Before tail
    private static Node insertBeforeTail(Node head, int value) {

        // If there is only one element present technically it shoulde be tail as well as head
        if (head.next == null) {
            return insertBeforeHead(head, value);
        }

        // traverse to last node of the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // create a new node
        Node newNode = new Node(value);
        Node prev = temp.back;

        prev.next = newNode;
        newNode.back = prev;
        // remove the connection
        newNode.next = temp;
        temp.back = newNode;

        return head;

    }

    private static Node insertBeforeKthNode(Node head, int value, int k) {
        if (k == 1) {
            // inserting at head
            return insertBeforeHead(head, value);
        }

        // Moving to the Kth node
        int cnt = 1;
        Node temp = head;
        while (cnt < k && temp.next != null) {
            cnt++;
            temp = temp.next;
            // if(cnt == k) break;
        }
        // Now temp is standing at Kth node
        // Create  a two nodes prev and next
        Node newNode = new Node(value);
        Node prevNode = temp.back;
        newNode.back = prevNode;
        newNode.next = temp;
        // prevNode.next = null;
        // temp.back = null;
        prevNode.next = newNode;
        temp.back = newNode;

        return head;
    }

    private static void insertBeforeKthNode(Node temp, int val) {
        // question will gurantee that they will not give head as an node because they want to alter head always

        // create a prev node
        Node prevNode = temp.back;
        // creating an New node with given value
        Node newNode = new Node(val);

        // linking connection
        newNode.next = temp;
        newNode.back = prevNode;
        prevNode.next = newNode;
        temp.back = newNode;

    }

    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 4, 5};
        Node head = Arr2Dll(arr);
        printLL(head);

        // Deleting the head
        // head = delHead(head);
        // printLL(head);
        // Deleting the Tail
        // head = delTail(head);
        // printLL(head);
        // Deleting Kth Element
        // head = delKthNode(head, 5);
        // printLL(head);
        // deleteNode(head);
        // printLL(head);
        // INSERTION OPERATIONS
        // head = insertBeforeHead(head, 12);
        // head = insertBeforeTail(head,100);
        // head = insertBeforeKthNode(head, 33, 1);
        // insertion Before Kth node
        insertBeforeKthNode(head.next.next, 120);
        printLL(head);

    }
}
