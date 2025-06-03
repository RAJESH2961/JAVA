

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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    // Deleting an HEAD in LinkedList
    private static Node DeleteHead(Node head){
        if(head == null) return  head;
        return head.next;
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
  }  
}
