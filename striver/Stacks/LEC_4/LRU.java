import java.util.HashMap;
import java.util.Map;

class LRUCache {
    
    // Doubly linked list node structure
    class Node {
        int key;
        int value;
        Node prev, next;

        // Constructor to initialize a node
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Dummy head and tail nodes to simplify insert/remove operations
    private Node head = new Node(0, 0);
    private Node tail = new Node(0, 0);

    // HashMap for O(1) access to nodes by key
    private Map<Integer, Node> map = new HashMap<>();

    // Cache capacity
    private final int capacity;

    // Constructor: initialize the cache with the given capacity
    public LRUCache(int capacity) {
        this.capacity = capacity;

        // Initially link head and tail
        head.next = tail;
        tail.prev = head;
    }

    // Get the value of the key if present, else return -1
    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);  // Get node from map
            remove(node);              // Move to head (most recently used)
            insert(node);
            return node.value;         // Return the value
        }
        return -1;  // Key not found
    }

    // Put the key-value pair into the cache
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));  // Remove old value if it exists
        }

        // If capacity reached, remove the least recently used node (before tail)
        if (map.size() == capacity) {
            remove(tail.prev);
        }

        // Insert the new node at the front (most recently used)
        insert(new Node(key, value));
    }

    // Remove node from linked list and map
    private void remove(Node node) {
        map.remove(node.key);               // Remove from map
        node.prev.next = node.next;         // Unlink from list
        node.next.prev = node.prev;
    }

    // Insert node right after head (most recently used position)
    private void insert(Node node) {
        map.put(node.key, node);            // Add to map
        node.next = head.next;              // Re-link pointers
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}


public class LRU {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(3);
        obj.put(10,10);
        obj.put(20,20);
        obj.put(30,30);

        System.out.println(obj.get(30));
    }
}