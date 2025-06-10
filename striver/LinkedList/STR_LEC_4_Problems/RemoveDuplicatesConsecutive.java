public class RemoveDuplicatesConsecutive {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Build input list [1,2,3,3,4,4,5]
        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(3,
                            new ListNode(3,
                            new ListNode(4,
                            new ListNode(4,
                            new ListNode(5)))))));

        ListNode result = sol.deleteDuplicates(head);
        printList(result);  // Should print: 1 -> 2 -> 3 -> 4 -> 5
    }

    static void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode nextNode = temp.next;
            while(nextNode != null && temp.val == nextNode.val){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            temp = temp.next;
        }
        return head;
    }
}
