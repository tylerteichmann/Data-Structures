public class MyLinkedList<T> {
    Node<T> head = null;

    public void AddFront(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void Append(T element) {
        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        // Set the last node.next to the new node
        currentNode.next = new Node<T>(element);
    }

    public String toString() {
        Node<T> currentNode = head;
        String returnString = "[ ";

        while (currentNode != null) {
            returnString += currentNode.data;
            currentNode = currentNode.next;
            if (currentNode != null) returnString += ", ";
        }

        returnString += " ]";

        return returnString;
    }
}
