import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedStackTest {

    private String TESTSTRING = "Hello";

    @Test
    public void Push_AddNodeWhenListIsEmpty_ShouldSuccessfullyAdd() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();

        // Act
        testStack.Push(TESTSTRING);

        // Assert
        assertEquals(TESTSTRING, testStack.Peek());
    }

    @Test
    public void Push_AddMultipleNodes_ShouldSuccessfullyAdd() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();

        // Act
        testStack.Push("World");
        testStack.Push(TESTSTRING);

        // Assert
        assertEquals(TESTSTRING, testStack.Peek());
    }

    @Test
    public void Pop_WhenListIsEmpty_ShouldReturnNull() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();

        // Assert
        assertEquals(null, testStack.Pop());
    }


    @Test
    public void Pop_WhenListHasValues_ShouldRemovedElement() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();
        testStack.Push(TESTSTRING);

        // Act - Assert
        assertEquals(TESTSTRING, testStack.Pop());
        assertEquals(null, testStack.Peek());
    }

    @Test
    public void IsEmpty_WhenListIsEmpty_ShouldReturnTrue() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();

        // Act - Assert
        assertTrue(testStack.IsEmpty());
    }

    @Test
    public void IsEmpty_WhenListIsFilled_ShouldReturnFalse() {
        // Arrange
        MyLinkedStack<String> testStack = new MyLinkedStack<String>();
        testStack.Push(TESTSTRING);

        // Act - Assert
        assertFalse(testStack.IsEmpty());
    }

    @Test
    public void Clear_WhenListHasValues_Should() {
        
    }
}
