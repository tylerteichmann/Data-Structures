// Tyler J. Teichmann

// Public class for MyLinkedList
public class MyLinkedList<T> {

    // Private Node to point to the head.
    private Node<T> head;
    // Private Node to point to the tail.
    private Node<T> tail;
    // Private integer to maintain the size of the list.
    private int size;

    /**
     * Default constructor for creating an MyLinkedList
     */
    public MyLinkedList() {
        // Point head to null.
        this.head = null;
        // Point tail to null.
        this.tail = null;
        // Set size to 0.
        this.size = 0;
    }

    /**
     * Non-default constructor for creating a filled linked list.
     * @param data Takes an array of Objects as input.
     */
    public MyLinkedList(T[] data) {

        // Create a new node at the head with the first object in the array
        this.head = this.tail = new Node<T>(data[0]);
        // Set the size to 1
        this.size = 1;

        // Create a new node that points to a position in the list.
        Node<T> currentNode = this.head;

        // For each element in the array data.
        for (int i = 1; i < data.length; i++) {
            // Set the next node in the list equal to a new node with the next data element
            // point the next pointer to null and point the previous pointed to the current node.
            currentNode.next = new Node<T>(data[i], null, currentNode);
            // Set the current node to the next node.
            currentNode = currentNode.next;
            // Increment size by 1
            this.size++;
            // Set the tail to the current node (Set inside of for loop in the event of a crash).
            this.tail = currentNode;
        }
    }

    /**
     * Gets the Head of the linked list.
     * @return Returns the head of the list.
     */
    public Node<T> Head() {
        // Return the head of the linked list.
        return this.head;
    }

    /**
     * Gets for the tail of the linked list.
     * @return Returns the tail of the list.
     */
    public Node<T> Tail() {
        // Return the tail of the linked list.
        return this.tail;
    }

    /**
     * Gets for the size of the linked list.
     * @return Returns the size of the list
     */
    public int Size() {
        // Return the size of the linked list.
        return this.size;
    }

    /**
     * Checks if the linked list is empty.
     * @return Returns true if the list is empty.
     */
    public boolean IsEmpty() {
        // Return true if the linked list is empty.
        return head == null;
    }

    /**
     * Prints the list in reverse
     * @return Returns a string for testing
     */
    public String ForwardTraverse() {
        // Create the return string and start with [
        String returnString = "[ ";

        // Create a node to track position in the list
        Node<T> currentNode = this.head;

        // While the node is not null
        while (currentNode != null) {
            // Add the data at the current node to the string
            returnString += currentNode.data;
            // Advance the node
            currentNode = currentNode.next;
            // if there is another node add a comma
            if (currentNode != null) returnString += ", ";
        }
        // End the string with a ]
        returnString += " ]";

        // Print the string
        System.out.println(returnString);

        // Return the new string.
        return returnString;
    }

    /**
     * Prints the list in reverse
     * @return
     */
    public String ReverseTraverse() {
        // Create the return string and start with [
        String returnString = "[ ";

        // Create a node to track position in the list
        Node<T> currentNode = this.tail;

        // While the node is not null
        while (currentNode != null) {
            // Add the data at the current node to the string
            returnString += currentNode.data;
            // Advance the node
            currentNode = currentNode.previous;
            // if there is another node add a comma
            if (currentNode != null) returnString += ", ";
        }
        // End the string with a ]
        returnString += " ]";

        // Print the string
        System.out.println(returnString);

        // Return the new string.
        return returnString;
    }

    /**
     * Gets a given index in the linked list.
     * @param index Takes the desired index to get as input.
     * @return Returns the object value at that element.
     */
    public Node<T> Get(int index) {
        // Identify if indexing using positive or negative indices.
        if (-this.size <= index && index < 0) {
            // Create a new node that points to a position in the list. Set it equal to the tail of the list.
            Node<T> currentNode = this.tail;

            // Iterate through the linked list the number of times of the index to get.
            for (int i = 0; i > index + 1; i--) {
                // Advance the pointer to the location of the next node in the list
                currentNode = currentNode.previous;
            }

            // Return the data at the current Node.
            return currentNode;
        } else if (0 <= index && index < this.size) {
            // Create a new node that points to a position in the list. Set it equal to the head of the list.
            Node<T> currentNode = this.head;

            // Iterate through the linked list the number of times of the index to get.
            for (int i = 0; i < index; i++) {
                // Advance the pointer to the location of the next node in the list
                currentNode = currentNode.next;
            }

            // Return the data at the current Node.
            return currentNode;
        }
        System.out.println("Index Out of Bounds!");
        return null;
    }

    /**
     * Adds an element to the front of the linked list.
     * @param element Takes the element to be added as input.
     */
    public void AddFront(T element) {
        // Create a new node for the element to be added.
        // Its next node will be the current head
        Node<T> newNode = new Node<T>(element, this.head, null);
        // If the list is empty.
        if (this.IsEmpty()) {
            // Point the head and the tail to the new node.
            this.head = this.tail = newNode;
        // If the list is not empty.
        } else {
            // Point the head to the new node
            this.head = newNode;
            // Point the next node's previous node back to the new node
            newNode.next.previous = newNode;
        }
        // Increment the size of the list.
        size++;
    }

    /**
     * Adds an element to the end of the linked list.
     * @param element Takes the element to be added as input.
     */
    public void Append(T element) {
        // Create a new node for the element to be added
        // It's previous node will be the current tail
        Node<T> newNode = new Node<T>(element, null, this.tail);
        // If the list is empty.
        if (this.IsEmpty()) {
            // Point the head and the tail to the new node.
            this.head = this.tail = newNode;
        // If the list is not empty.
        } else {
            // Point the head to the new node
            this.tail = newNode;
            // Point the next node's previous node back to the new node
            newNode.previous.next = newNode;
        }
        // Increment the size of the list.
        size++;
    }

    /**
     * Insert an object at a specific index in the list.
     * @param index The index to insert the object.
     * @param element The object to insert.
     */
    public void Insert(int index, T element) {
        // If the index is 0.
        if (index == 0) {
            // Add the element to the front of the list
            AddFront(element);
        // Else if the index is equal to the size of the list
        } else if (index == this.size - 1 || index == -1) {
            // Append the element to the end of the list
            Append(element);
        // Else
        } else if (-this.size <= index && index < this.size) {
            // Identify if indexing using positive or negative indices.
            if (index < 0) {
                // Create a new node that points to a position in the list. Set it equal to the tail of the list.
                Node<T> currentNode = this.tail;

                // Iterate through the linked list the number of times of the index to get.
                for (int i = 0; i > index + 1; i--) {
                    // Advance the pointer to the location of the next node in the list
                    currentNode = currentNode.previous;
                }

                // Create the new node with its next being the current's next and its previous being the currents previous.
                Node<T> newNode = new Node<T>(element, currentNode.next, currentNode);
                // Set the next node's previous to the new node.
                newNode.next.previous = newNode;
                // Set the current nodes next to the new node.
                currentNode.next = newNode;
            } else {
                // Create a new node that points to a position in the list. Set it equal to the head of the list.
                Node<T> currentNode = this.head;

                // Iterate through the linked list the number of times of the index to get.
                for (int i = 0; i < index - 1; i++) {
                    // Advance the pointer to the location of the next node in the list
                    currentNode = currentNode.next;
                }

                // Create the new node with its next being the current's next and its previous being the current.
                Node<T> newNode = new Node<T>(element, currentNode.next, currentNode);
                // Set the next node's previous to the new node.
                newNode.next.previous = newNode;
                // Set the current nodes next to the new node.
                currentNode.next = newNode;
            }
            // Increment the size
            size++;
        } else {
            System.out.println("Index Out of Bounds");
        }
    }

    /**
     * Delete the first object in the list
     */
    public void DeleteFront() {
        // If there is only one element
        if (this.size < 2) {
            // null the list
            this.head = this.tail = null;
        // Else list is not empty
        } else {
            // Set the head equal to head to the next element.
            this.head = this.head.next;
            // Set the new head's previous node to null
            this.head.previous = null;
        }
        // Decrement the size
        size--;
    }

    /**
     * Delete the last object in the list
     */
    public void DeleteBack() {
        // If there is only one element
        if (this.size < 2) {
            // null the list
            this.head = this.tail = null;
        // Else list is not empty
        } else {
            // Set the tail equal to the previous node
            this.tail = tail.previous;
            // Set the next node to null
            this.tail.next = null;
        }
        // Decrement the size;
        size--;
    }

    /**
     * Delete an element based on its value
     * @param element Value to be deleted from linked list
     */
    public void DeleteNodeBasedOnValue(T element) {
        // If list is empty
        if (this.head == null) {
            // Print the list is empty
            System.out.println("List is empty");
            // Return
            return;
        }
        // If the element is the first node.
        if (this.head.data == element) {
            // Delete from the front of the list
            DeleteFront();
        // Else if the element is the last in the list
        } else if (this.tail.data == element) {
            // Delete from the back of the list
            DeleteBack();
        // Else
        } else {
            // Create a new node that points to a position in the list. Set it equal to the head of the list.
            Node<T> currentNode = this.head;

            // Move through the list until the element is found
            while (currentNode != null) {
                if (currentNode.data == element) {
                    // Set the previous node's next to the next node.
                    currentNode.previous.next = currentNode.next;
                    // Set the next nodes previous to the previous node.
                    currentNode.next.previous = currentNode.previous;
                    // Decrement the size
                    size--;
                    // Return;
                    return;
                } else {
                    // Set the current node to the next.
                    currentNode = currentNode.next;
                }
            }

            // If while loop exits, element is not in list
            System.out.println("Element Not in List");
            return;
        }
    }

        /**
     * Delete an element based on its value
     * @param element Value to be deleted from linked list
     */
    public void Remove(int index) {
        // If the element is the first node.
        if (index == 0 || index == -size) {
            // Delete from the front of the list
            DeleteFront();
        // Else if the element is the last in the list
        } else if (index == size -1 || index == -1) {
            // Delete from the back of the list
            DeleteBack();
        // Else
        } else if (-this.size <= index && index < this.size) {
            // Identify if indexing using positive or negative indices.
            if (index < 0) {
                // Create a new node that points to a position in the list. Set it equal to the tail of the list.
                Node<T> currentNode = this.tail;

                // Iterate through the linked list the number of times of the index to get.
                for (int i = -1; i > index; i--) {
                    // Advance the pointer to the location of the next node in the list
                    currentNode = currentNode.previous;
                }

                // Set the previous node's next to the next node.
                currentNode.previous.next = currentNode.next;
                // Set the next nodes previous to the previous node.
                currentNode.next.previous = currentNode.previous;
            } else {
                // Create a new node that points to a position in the list. Set it equal to the head of the list.
                Node<T> currentNode = this.head;

                // Iterate through the linked list the number of times of the index to get.
                for (int i = 0; i < index; i++) {
                    // Advance the pointer to the location of the next node in the list
                    currentNode = currentNode.next;
                }

                // Set the previous node's next to the next node.
                currentNode.previous.next = currentNode.next;
                // Set the next nodes previous to the previous node.
                currentNode.next.previous = currentNode.previous;
            }
            // Decrement the size
            size--;
        } else {
            System.out.println("Index Out of Bounds");
            return;
        }
    }

    /**
     * Returns the list as a string
     */
    public String toString() {
        // Create the return string and start with [
        String returnString = "[ ";

        // Create a node to track position in the list
        Node<T> currentNode = this.head;

        // While the node is not null
        while (currentNode != null) {
            // Add the data at the current node to the string
            returnString += currentNode.data;
            // Advance the node
            currentNode = currentNode.next;
            // if there is another node add a comma
            if (currentNode != null) returnString += ", ";
        }
        // End the string with a ]
        returnString += " ]";

        // Return the new string.
        return returnString;
    }

}
