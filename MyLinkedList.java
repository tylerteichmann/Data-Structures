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

        if (head == null) {
            AddFront(element);
        } else {
            Node<T> currentNode = this.head;
    
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
    
            // Set the last node.next to the new node
            currentNode.next = new Node<T>(element);
    
            size++;
        }

    }

    public void Insert(int index, T element) {
        Node<T> currentNode = this.head;

        if (index == 0) {
            AddFront(element); 
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
    
            Node<T> newNode = new Node<T>(element, currentNode.next);
    
            currentNode.next = newNode;

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

    public void DeleteFront() {
        head = head.next;
        size--;
    }

    public void DeleteBack() {
        Node<T> currentNode = head;
        if (currentNode.next == null) {
            DeleteFront();
        } else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
    
            currentNode.next = null;
            size--;
        }
    }

    public void DeleteNodeBasedOnValue(T element) {
        if (head == null) return;

        Node<T> currentNode = head;

        if (currentNode.data == element) {
            DeleteFront();
        } else {
            while (currentNode.next.data != element) {
                currentNode = currentNode.next;
                if (currentNode.next == null) {
                    System.out.println("Value not found!");
                    return;
                }
            }
            currentNode.next = currentNode.next.next;
            size--;
        }
    }

    public int Size() {
        return this.size;
    }

    public boolean IsEmpty() {
        return head == null;
    }
}
