/**
 * MyLinkedQueue
 */
public class MyLinkedQueue<T> {

    private Node<T> head, tail;
    private int size;

    public MyLinkedQueue() {
        head = null;
        tail = null;
    }

    public void Enqueue(T data) {
        if (tail != null) {
            tail.next = new Node<T>(data, null, tail);
            tail = tail.next;
        } else {
            head = tail = new Node<T>(data);
        }
        size++;
    }

    public void Dequeue() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
            size--;
        }
    }

    public T Front() {
        if (head != null) return head.data;
        else return null;
    }

    public T Back() {
        if (tail != null) return tail.data;
        else return null;
    }

    public int Size() {
        return size;
    }
}