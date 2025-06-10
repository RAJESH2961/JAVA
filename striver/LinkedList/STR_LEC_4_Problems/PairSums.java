import java.util.ArrayList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

// class Solution {
    
// }

public class PairSums {
    // Utility method to print the linked list (for debugging)
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        // Edge cases
        if (head == null || head.next == null) {
            return output;
        }

        Node temp1 = head;
        Node temp2 = head;

        // Find the tail (temp2)
        while (temp2.next != null) {
            temp2 = temp2.next;
        }

        // Two pointer approach
        while (temp1 != null && temp2 != null && temp1 != temp2 && temp1.data < temp2.data) {
            int sum = temp1.data + temp2.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(temp1.data);
                pair.add(temp2.data);
                output.add(pair);

                temp1 = temp1.next;
                temp2 = temp2.prev;
            } else if (sum < target) {
                temp1 = temp1.next;
            } else {
                temp2 = temp2.prev;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        // Create sample doubly linked list: 1 <-> 2 <-> 4 <-> 5 <
    // Create sample doubly linked list: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
    int[] values = {1, 2, 4, 5, 6, 8, 9};
    Node head = null, tail = null;

    for (int val : values) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Target sum
    int target = 7;

    // Print the list (optional)
    System.out.print("Doubly Linked List: ");
    printList(head);

    // Get pairs with given sum
    ArrayList<ArrayList<Integer>> result = findPairsWithGivenSum(target, head);

    // Print result
    System.out.println("Pairs with sum " + target + ":");
    for (ArrayList<Integer> pair : result) {
        System.out.println(pair.get(0) + ", " + pair.get(1));
    }
        }}