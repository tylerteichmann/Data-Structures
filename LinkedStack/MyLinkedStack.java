// Tyler J. Teichmann

/**
 * Class for a linked stack.
 */
public class MyLinkedStack<T> {

    // Node for the head of the stack.
    private Node<T> head = null;

    /**
     * Creates a new Node and adds it to the top of the stack.
     * @param data The data which should be populated to into the Node.
     */
    public void Push(T data) {
        // Create a newNode for the input data, with the next node pointing to the head of the stack.
        Node<T> newNode = new Node<T>(data, this.head, null);
        // Set the head of the stack to point at the new node.
        this.head = newNode;
    }

    /**
     * Returns the top item on the stack without removing it from the stack.
     * @return Item on top of the stack.
     */
    public T Peek() {
        // Check if stack is empty
        if (head == null) {
            // Return null
            return null;
        // Else
        } else {
            // Return the data for the head of the stack.
            return this.head.data;
        }
    }

    /**
     * Returns the top item on the stack, removing it from the stack.
     * @return Item on top of the stack.
     */
    public T Pop() {
        // Check if the stack is empty
        if (head == null){
            // Return null if it is empty
            return null;
        }
        // Create a holder for the data in the head.
        T topElementData = this.head.data;
        // Set the head equal to the next node.
        this.head = head.next;
        // Return the holder.
        return topElementData;
    }

    /**
     * Checks if the stack is empty
     * @return True if the stack is empty.
     */
    public boolean IsEmpty() {
        return head == null;
    }

    /**
     * Clears the whole stack.
     */
    public void Clear() {
        head = null;
    }

}
