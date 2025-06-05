class Node{
    int data;
    Node next;
    // constructor
    Node(int data1){
        data = data1;
    }
}


public class L2_InsertionOperations {

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

    // Insertion at head
    private static Node insertAtHead(Node head,  int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        return head;
    }

    // Insertion at End
    private static Node insertAtEnd(Node head,  int value){
        if(head == null){
            return new Node(value);// Returning single element when there is no element at first
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node tail = new Node(value);
        temp.next = tail;
        return head;
    }

    // Insert at Kth Position
    private static Node insertkthPosition(Node head, int ele, int k){
        if(head == null){
            return new Node(ele); // If there is no element create a new 
        }
        if(k == 1) { // If I want to insert at starting head
            Node temp = new Node(ele);
            temp.next = head;
            head = temp;
        }

        // Inserting at some position
        int cnt = 0;
        if(k > cnt){
            System.out.println("The k th value is greather that the node length please specift hte correct value");
        }
        Node temp = head;
        while(temp.next != null){
            cnt++;
            if(cnt == (k-1)){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // Inserting Before the value
    // need to insert the element before the value
    private static Node insertBefore(Node head,int ele, int val){
        if(head == null){ // i cant insert anything before
            return null;
        }
        if(head.data == val) { // If head value is equal to value i need to insert before the head
            Node temp = new Node(ele);
            temp.next = head;
            head = temp;
            return head;
        }

        // Inserting at some position
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 23};

        Node head = array2LL(arr);

        // Insering at head
        head = insertAtHead(head, 01);
        // printLL(head);

        head = insertAtEnd(head,50);
        // printLL(head);

        // Insert at Kth Position
        head = insertkthPosition(head, 12, 2);
        // printLL(head);

        // Insert Before the Position
        head = insertBefore(head, 121, 3);
        printLL(head);


    }
    
}
oh