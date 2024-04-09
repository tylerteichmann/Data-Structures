import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void DeleteNodeBasedOnValue_EmptyList_ListDoesNotChange() {
        // Arrange
        MyLinkedList<String> myList = new MyLinkedList<String>();

        // Act
        myList.DeleteNodeBasedOnValue("Art");

        // Assert
        assertEquals(myList.Size(), 0);
    }

    @Test
    public void DeleteNodeBasedOnValue_SingleNodeList_DeleteSingleNode() {
        // Arrange
        MyLinkedList<String> myList = new MyLinkedList<String>();
        myList.AddFront("Hello");

        // Act
        myList.DeleteNodeBasedOnValue("Hello");

        // Assert
        assertEquals(myList.Size(), 0);
        assertEquals(myList.IsEmpty(), true);
    }

    @Test
    public void DeleteNodeBasedOnValue_ElementNotInList_ListDoesNotChange() {
        // Arrange
        MyLinkedList<String> myList = new MyLinkedList<String>();
        myList.AddFront("Hello");

        // Act
        myList.DeleteNodeBasedOnValue("Art");

        // Assert
        assertEquals(myList.Size(), 1);
    }
}
