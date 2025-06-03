

class Node{
    int data;
    Node next;
    // constructor
    Node(int data1){
        data = data1;
    }
}


public class L2_DeletionOperations {

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


    // Deleting an HEAD in LinkedList
    private static Node DeleteHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    // // Deleting an Tail in LinkedList
    private static Node DeleteTail(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Deleting an Element at any location

    private static Node deleteElement(Node head, int k){
        if(head == null) return head;
        if(k == 1){
            return head.next;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            cnt++;
            if(cnt == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Delete element based on value
    private static Node deleteEl(Node head, int value){
        if(head == null) return head;
        if(head.data == value){
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            if(temp.data == value){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


  public static void main(String[] args) {
    int[] arr = {12, 3, 21, 4, 54};

    // Getting head
    Node head = array2LL(arr);
    // Printing LinkedList
    printLL(head);


    // Before deletion head is 
    System.out.println(" Before Deleting Head is "+head.data);

    // After deletion head is 
    System.out.println(" After Deleting Head is "+DeleteHead(head).data);


    // Before deletion Tail is 
    System.out.println(" Before Deleting Tail is ");
    printLL(head);
    // Delete Tail
    head = DeleteTail(head);

    // After deletion Tail is 
    System.out.println(" After Deleting Tail is ");
    printLL(head);

    // Deleting an Element
    head = deleteElement(head, 3);
    printLL(head);

    head = deleteEl(head,3);
    printLL(head);
  }  
}
