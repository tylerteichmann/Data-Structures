public class MyLinkedList<T> {
    private Node<T> head = null;
    private int size = 0;

    public void AddFront(T element) {
        Node<T> newNode = new Node<T>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
    }

    public void Append(T element) {
        Node<T> currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        // Set the last node.next to the new node
        currentNode.next = new Node<T>(element);

        size++;
    }

    public void Insert(int index, T element) {
        Node<T> currentNode = this.head;
        
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }


    }

    public T Get(int index) {
        Node<T> currentNode = this.head;
        
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public String toString() {
        Node<T> currentNode = this.head;
        String returnString = "[ ";

        while (currentNode != null) {
            returnString += currentNode.data;
            currentNode = currentNode.next;
            if (currentNode != null) returnString += ", ";
        }

        returnString += " ]";

        return returnString;
    }

    public int Size() {
        return this.size;
    }
}
