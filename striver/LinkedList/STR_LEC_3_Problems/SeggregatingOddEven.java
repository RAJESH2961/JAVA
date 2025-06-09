
import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class SeggregatingOddEven {
    // int[] arr;
    ArrayList<Integer> arr = new ArrayList<>();

    private static Node seggregateFunctionBrute(Node head) {
        if (head == null || head.next == null) return head;

        ArrayList<Integer> values = new ArrayList<>();
        Node temp = head;
        int position = 1;

        // 1. First pass: add odd-positioned values
        while (temp != null) {
            if (position % 2 != 0) {
                values.add(temp.data);
            }
            temp = temp.next;
            position++;
        }

        // 2. Second pass: add even-positioned values
        temp = head;
        position = 1;
        while (temp != null) {
            if (position % 2 == 0) {
                values.add(temp.data);
            }
            temp = temp.next;
            position++;
        }

        // 3. Third pass: overwrite node values
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = values.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    private static Node seggregateFunction(Node head) {
        if (head == null || head.next == null) return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even; // store the start of even list

        // Rearranging nodes
        while (even != null && even.next != null) {
            // odd.next = even.next;
            // odd = odd.next;

            // even.next = odd.next;
            // even = even.next;
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        // Attach even list at the end of odd list
        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = seggregateFunction(head);

        Node bruteHead = seggregateFunctionBrute(head);

        // Print the segregated list: 1 -> 3 -> 5 -> 2 -> 4
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
        // Print the segregated list: 1 -> 3 -> 5 -> 2 -> 4
        Node temp1 = bruteHead;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
}
