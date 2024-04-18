import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MyLinkedQueueTest {
    @Test
    public void Enqueue_EmptyQueue_ShouldAdd() {
        // Arrange
        MyLinkedQueue<String> testQueue = new MyLinkedQueue<String>();

        // Act
        testQueue.Enqueue("Hello");

        // Assert
        assertNotNull(testQueue);
        assertEquals("Hello", testQueue.Back());
        assertEquals("Hello", testQueue.Front());
    }

    @Test
    public void Enqueue_QueueMultipleTimes_ShouldUpdateHeadTail() {
        // Arrange
        MyLinkedQueue<String> testQueue = new MyLinkedQueue<String>();

        // Act
        testQueue.Enqueue("Hello");
        testQueue.Enqueue("World");

        // Assert
        assertEquals("Hello", testQueue.Front());
        assertEquals("World", testQueue.Back());
    }

    @Test
    public void Dequeue_QueueHasNoItems_ShouldLeaveHeadNull() {
        // Arrange
        MyLinkedQueue<String> testQueue = new MyLinkedQueue<String>();

        // Act
        testQueue.Dequeue();

        // Assert
        assertNull(testQueue.Front());
    }

    @Test
    public void Dequeue_QueueHasOneItems_ShouldSetHeadAndTailToNull() {
        // Arrange
        MyLinkedQueue<String> testQueue = new MyLinkedQueue<String>();
        testQueue.Enqueue("Hello");

        // Act
        testQueue.Dequeue();

        // Assert
        assertNull(testQueue.Front());
        assertNull(testQueue.Back());
    }

    @Test
    public void Dequeue_QueueHasMultipleItems_ShouldRemoveFrontItem() {
        // Arrange
        MyLinkedQueue<String> testQueue = new MyLinkedQueue<String>();
        testQueue.Enqueue("Hello");
        testQueue.Enqueue("World");
        testQueue.Enqueue("Hi");

        // Act
        testQueue.Dequeue();

        // Assert
        assertEquals("World", testQueue.Front());
    }
}
