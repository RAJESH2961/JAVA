// Node Structure
class Node {
    int data;
    Node next;
    // Constructor
    // Node(int data1, Node next1){
    //     this.data = data1;
    //     this.next = next1;
    // }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
} 




public class SearchElement {
    // convert array to linked list
    private static Node Convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Traversing and searching an Element
    // Return true or false
    // when ever they are asked to do operations they only give head
    private static boolean FindElement(Node head, int element){
        Node temp = head;
        while(temp != null){
            if(temp.data == element){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12, 2, 32, 5};
        Node head = Convert2LL(arr);
        System.out.println(FindElement(head, 5));
    }
}
