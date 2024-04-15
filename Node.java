//Tyler J. Teichmann

// Node class for a doubly linked list.
public class Node<T> {

    // Data to store of type T.
    T data;
    // Pointer for the next node in the list.
    Node<T> next;
    // Pointer for the previous node in the list.
    Node<T> previous;

    // Constructor for the node if the place in the list is not specified.
    public Node(T data) {
        // Set the data in the node.
        this.data = data;
        // Set the next node in the list.
        this.next = null;
        // Set the previous node in the list.
        this.previous = null;
    }

    // Constructor for the node if location is specified.
    public Node(T data, Node<T> next, Node<T> previous) {
        // Set the data in the node.
        this.data = data;
        // Set the next node in the list.
        this.next = next;
        // Set the previous node in the list.
        this.previous = previous;
    }
}
