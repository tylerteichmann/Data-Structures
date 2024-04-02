public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private final int CAPACITY = 10;

    /**
     * Constructor for class MyArrayList
     */
    public MyArrayList() {
        // Create an array with an initial size of 10;
        elements = new Object[CAPACITY]; // initial capacity
        size = 0; // Keeps track of the number of elements that actually exists in our array list.
    }

    /**
     * Adds an integer to the first element in MyArrayList
     * @param element Integer to add to the beginning of the array.
     */
    public void AddStart(T element) {
        EnsureCapacity();
        for (int i = size; i >= 0; i--) {
            elements[i + 1] = elements[i]; 
        }
        elements[0] = element;
        size++;
    }

    /**
     * Adds an integer to an index in the array, pushing the values after that index 1
     * @param element Integer to add to a desired index
     * @param index Index to add to the element at
     */
    public void AddAtIndex(T element, int index) {
        if (index > size || index < 0) {
            AddEnd(element);
        } else {
            EnsureCapacity();

            for (int i = size; i >= index; i--) {
                elements[i+ 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * Add an integer to the end of the array
     * @param element Integer to add to the end of the array
     */
    public void AddEnd(T element) {
        // Check capacity
        EnsureCapacity();
        elements[size++] = element;
    }

    /**
     * Get an integer at a desired index
     * @param index index to get 
     * @return Returns the value at the index
     */
    public Object GetElementAtIndex(int index) {
        if (index >= size || index < 0) {
            return elements[size - 1];
        }

        return elements[index];
    }

    /**
     * Method to extend the array if we have reached the capacity
     */
    private void EnsureCapacity() {
        if(size == elements.length) {
            // increase capacity of the array
            Object[] newElements = new Object[elements.length * 2];
            
            for(int i = 0; i < elements.length; i++) {
               newElements[i] = elements[i];
            }

            elements = newElements;
        }
    }

    /**
     * Prints the address of the current list
     */
    public void GetAddress(){
        System.out.println(elements);
    }

    /**
     * Prints the array
     */
    public void Print(){
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Deletes the Object at index 0.
     */
    public void DeleteAtStart() {
        DeleteAtIndex(0);
    }

    /**
     * Deletes the Object at index size -1 (last index).
     */
    public void DeleteAtEnd() {
        DeleteAtIndex(size - 1);
    }

    /**
     * Deletes the Object at a given index
     * @param indexOfValueToDelete index to delete
     */
    public void DeleteAtIndex(int indexOfValueToDelete) {
        if (indexOfValueToDelete < 0 || indexOfValueToDelete >= size) {
            throw new IndexOutOfBoundsException("Index " + indexOfValueToDelete + " is invalid for ArrayList of size " + size);
        }

        for (int i = indexOfValueToDelete; i < size; i++) {
            elements[i] = elements[i+1];
        }

        size--;
    }

    /**
     * Clears the entire list.
     */
    public void ClearAll() {
        for (int i = 0; i < size - 1; i++) {
            elements[i] = 0;
        }
        size = 0;
    }

    /**
     * Evaluates if the list is empty
     * @return returns true for an empty array, false if not
     */
    public boolean IsEmpty() {
        return size == 0;
    }

    /**
     * Evaluates the size of the array
     * @return returns the size of the array
     */
    public int Size() {
        return size;
    }
}
