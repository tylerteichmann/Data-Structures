// Tyler J. Teichmann

// Import Test for testing methods.
import org.junit.Test;
// Import assertEquals for testing methods.
import static org.junit.Assert.assertEquals;
// Import assertTrue for testing methods.
import static org.junit.Assert.assertTrue;
// Import assertFalse for testing methods.
import static org.junit.Assert.assertFalse;
// Import assertNull for testing methods.
import static org.junit.Assert.assertNull;

// Public class for the Tests.
public class SingleElementList_MyLinkedListTest {

    // Constant Integer Array for filling linked list.
    public final Integer[] TESTARRAY = new Integer[]{0};
    // Constant Integer for testing insertions.
    public final Integer TESTINTEGER = 4;
    // Constant int for an index that will always be out of bounds.
    public final int OUTOFBOUNDSINDEX = TESTARRAY.length + 10;
    // Constant to store the data type of the test array.
    public final Class<?> testT = TESTARRAY[0].getClass();

    // Annotation for test method.
    @Test
    // Test method for ToString method
    public void ToString_SingleElementList_BracketsWithElement() {
        //Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        // Add an element to the linked list.
        testList.AddFront(TESTINTEGER);

        // Act - Assert.
        assertEquals("[ " + TESTINTEGER + " ]", testList.toString());
    }

    // Annotation for test method.
    @Test
    // Test method for non default constructor
    public void MyLinkedList_Input_CreateSingleElementList() {
        // Arrange a string to compare against the output
        String testString = "[ ";
        // Iterate over the test array and add the values to a string
        for (int i = 0; i < TESTARRAY.length; i++){
            // Add the value to the string
            testString += TESTARRAY[i];
            // if it is not the last element, add a seperator
            if (i != TESTARRAY.length - 1) testString += ", ";
        }
        // Close the string.
        testString += " ]";

        // Act
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Assert testList is created and it is an instance of MyLinkedList
        assertTrue(testList instanceof MyLinkedList);
        
        // Assert the testList is filled with the input values.
        assertEquals(testList.toString(), testString);
    }

    // Annotation for test method.
    @Test
    // Test Method for Head method
    public void Head_SingleElementList_HeadPointsToFirstElement(){
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(TESTARRAY[0], testList.Head().data);
        // If there is more than 1 element in the array
        if (TESTARRAY.length > 1) {
            // Assert Head's next node points to the same value as the 2nd element of the test array.
            assertEquals(TESTARRAY[1], testList.Head().next.data);
        } else {
            // Assert Head's next node points to Null
            assertNull(testList.Head().next);
        }
        // Assert Head's previous node remains null.
        assertNull(testList.Head().previous);
    }

    // Annotation for test method.
    @Test
    // Test method for Tail method.
    public void Tail_EmptyList_TailPointsToLastElement() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(TESTARRAY[TESTARRAY.length - 1], testList.Tail().data);
        // Assert tails's next node remains null.
        assertNull(testList.Tail().next);
        // If there is more than 1 element in the array
        if (TESTARRAY.length > 1) {
            // Assert Tail's previous node points to the same value as the 2nd to last element of the test array.
            assertEquals(TESTARRAY[TESTARRAY.length - 2], testList.Tail().previous.data);
        } else {
            // Assert Tail's previous node points to Null
            assertNull(testList.Tail().previous);
        }
    }

    // Annotation for test method.
    @Test
    // Test method for ForwardTraverse method
    public void ForwardTraverse_SingleElementList_BracketsWithElements() {
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // create a string to compare against the output
        String testString = "[ ";
        // Iterate over the test array and add the values to a string
        for (int i = 0; i < TESTARRAY.length; i++){
            // Add the value to the string
            testString += TESTARRAY[i];
            // if it is not the last element, add a seperator
            if (i != TESTARRAY.length - 1) testString += ", ";
        }
        // Close the string.
        testString += " ]";

        // Act - Assert
        assertEquals(testList.ForwardTraverse(), testString);
    }

    // Annotation for test method.
    @Test
    // Test method for ReverseTraverse method
    public void ReverseTraverse_SingleElementList_BracketsWithElements() {
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // create a string to compare against the output
        String testString = "[ ";
        // Iterate over the test array and add the values to a string
        for (int i = TESTARRAY.length - 1; i >= 0; i--){
            // Add the value to the string
            testString += TESTARRAY[i];
            // if it is not the first element, add a seperator
            if (i != 0) testString += ", ";
        }
        // Close the string.
        testString += " ]";

        // Act - Assert
        assertEquals(testList.ReverseTraverse(), testString);
    }

    // Annotation for test method.
    @Test
    // Test method for size method.
    public void Size_SingleElementList_LengthOfInputArray() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(TESTARRAY.length, testList.Size());
    }

    // Annotation for test method.
    @Test 
    // Test Method for IsEmpty Method.
    public void IsEmpty_SingleElementList_False() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertFalse(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_PositiveIndex_FirstElementInList() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Index to test get method
        int testIndex = 0;

        // Act - Assert for each index in the list
        for (; testIndex < TESTARRAY.length; testIndex++) {
            // value at the index of the test array should match the get value at same index of list.
            assertEquals(TESTARRAY[testIndex], testList.Get(testIndex).data);
        }
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_NegativeIndex_LastElementInList() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Index to test get method
        int testIndex = 0;

        // Act - Assert for each index in the list
        for (; testIndex < TESTARRAY.length; testIndex++) {
            // value at the index of the test array should match the get value at same index of list minus the length.
            assertEquals(TESTARRAY[testIndex], testList.Get(testIndex - TESTARRAY.length).data);
        }
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_IndexOutOfBounds_ReturnNull() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        int testIndex = OUTOFBOUNDSINDEX;

        // Act - Assert for positive out of bounds.
        assertNull(testList.Get(testIndex));
    }

    // Annotation for test method.
    @Test
    // Test method for AddFront method
    public void AddFront_SingleElementList_HeadPointsToNewItemTailPointsToLastItemSizeIsCorrect() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Store the old head to check later
        Node<Integer> oldHead = testList.Head();
        // Store the old tail to check later
        Node<Integer> oldTail = testList.Tail();

        // Act.
        testList.AddFront(TESTINTEGER);

        // Assert Head should equal the new value
        assertEquals(TESTINTEGER, testList.Head().data);
        // Head's next should point to the old head.
        assertEquals(oldHead, testList.Head().next);
        // Head's previous node should remain null.
        assertNull(testList.Head().previous);
        // Old Head's previous should point back to new head.
        assertEquals(oldHead.previous, testList.Head());

        // Tail should not change
        assertEquals(oldTail, testList.Tail());
        // Tail's next should remain null
        assertNull(testList.Tail().next);
        // Tail's previous node should point to the same node as the old tail
        assertEquals(oldTail.previous, testList.Tail().previous);

        // Size should increase by 1.
        assertEquals(TESTARRAY.length + 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method
    public void Append_SingleElementList_TailPointsToNewItemHeadPointsToFirstItemSizeIsCorrect() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Store the old head to check later
        Node<Integer> oldHead = testList.Head();
        // Store the old tail to check later
        Node<Integer> oldTail = testList.Tail();

        // Act.
        testList.Append(TESTINTEGER);

        // Assert new head did not change
        assertEquals(oldHead, testList.Head());
        // Head's next should point to the same as old head
        assertEquals(oldHead.next, testList.Head().next);
        // Head's previous node should remain null.
        assertNull(testList.Head().previous);

        // Tail's data should equal the test integer
        assertEquals(TESTINTEGER, testList.Tail().data);
        // Tail's next should remain null
        assertNull(testList.Tail().next);
        // Tail's previous node should point to the old tail
        assertEquals(oldTail, testList.Tail().previous);
        // Old Tail's next node should point back to new tail.
        assertEquals(oldTail.next, testList.Tail());

        // Size should increase by 1.
        assertEquals(TESTARRAY.length + 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Insert method with positive index.
    public void Insert_SingleElementListWithPositiveIndex_IndexDataIsNewDataItemSizeIsCorrect() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Random in bounds Index to insert into
        int insertIndex = (int)(Math.random() * TESTARRAY.length);
        // Old node
        Node<Integer> oldNode = testList.Get(insertIndex);
        // Old Previous Node
        Node<Integer> oldPreviousNode = testList.Get(insertIndex).previous;

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert the value at the index should now equal the test integer.
        assertEquals(TESTINTEGER, testList.Get(insertIndex).data);
        // Assert the previous node should point to the old previous node.
        assertEquals(oldPreviousNode, testList.Get(insertIndex).previous);
        // Assert the next node should point to the old node.
        assertEquals(oldNode, testList.Get(insertIndex).next);

        // if an old previous node existed
        if (oldPreviousNode != null) {
            // Assert the old previous node's next node should point to the new node
            assertEquals(oldPreviousNode.next.data, TESTINTEGER);
        // Else
        } else {
            // Head should equal the new data
            assertEquals(testList.Head().data, TESTINTEGER);
        }

        // Assert the old node's previous node should point to the new node
        assertEquals(oldNode.previous.data, TESTINTEGER);

        // Size should increase by 1.
        assertEquals(TESTARRAY.length + 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_SingleElementListWithNegativeIndex_IndexDataIsNewDataItemSizeIsCorrectt() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Random in bounds Index to insert into
        int insertIndex = (int)(Math.random() * TESTARRAY.length) - TESTARRAY.length;
        // Old node
        Node<Integer> oldNode = testList.Get(insertIndex);
        // Old Previous Node
        Node<Integer> oldNextNode = testList.Get(insertIndex).next;

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert the value at the index should now equal the test integer.
        assertEquals(TESTINTEGER, testList.Get(insertIndex).data);
        // Assert the previous node should point to the old node.
        assertEquals(oldNode, testList.Get(insertIndex).previous);
        // Assert the next node should point to the old next node.
        assertEquals(oldNextNode, testList.Get(insertIndex).next);

        // Assert the old node's next node should point to the new node
        assertEquals(oldNode.next.data, TESTINTEGER);

        // if an old next node existed
        if (oldNextNode != null) {
            // Assert the old next node's previous node should point to the new node
            assertEquals(oldNextNode.previous.data, TESTINTEGER);
        // Else
        } else {
            // Tail should equal the new data
            assertEquals(testList.Tail().data, TESTINTEGER);
        }

        // Size should increase by 1.
        assertEquals(TESTARRAY.length + 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Insert method with out of bounds index.
    public void Insert_SingleElmentListWithIndexOutOfBounds_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Out of bounds index
        int insertIndex = OUTOFBOUNDSINDEX;
        // State of list before
        String oldList = testList.toString();

        // Act
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert Size should not change.
        assertEquals(TESTARRAY.length, testList.Size());
        // Assert 
        assertEquals(oldList, testList.toString());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteFront method.
    public void DeleteFront_SingleElementList_HeadPointsToOldHeadsNextNode() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Store the old head to check later
        Node<Integer> oldHead = testList.Head();

        // Act.
        testList.DeleteFront();

        // Assert head now equals the old head's next
        assertEquals(oldHead.next, testList.Head());

        // Size should decreas by 1.
        assertEquals(TESTARRAY.length - 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteBack method.
    public void DeleteBack_SingleElementList_TailPointsToOldTailsPreviousNode() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Store the old tail to check later
        Node<Integer> oldTail = testList.Tail();

        // Act.
        testList.DeleteBack();

        // Tail's data should equal the old tail's previous
        assertEquals(oldTail.previous, testList.Tail());

        // Size should decrease by 1.
        assertEquals(TESTARRAY.length - 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteNodeBasedOnValue method.
    public void DeleteNodeBasedOnValue_SingleElementListValueExists_ValueIsRemoved() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Random in bounds Index to insert into
        Node<Integer> deleteNode = testList.Get((int)(Math.random() * TESTARRAY.length));
        // Old Previous Node
        Node<Integer> oldPreviousNode = deleteNode.previous;
        // Old Next node
        Node<Integer> oldNextNode = deleteNode.next;

        // Act.
        testList.DeleteNodeBasedOnValue(deleteNode.data);

        // If old previous node existed
        if (oldPreviousNode != null) {
            // Assert the old previous node's next node should point to the old next node
            assertEquals(oldPreviousNode.next, oldNextNode);
        // Else
        } else {
            // Assert the Head should now equal the old next node
            assertEquals(oldNextNode, testList.Head());
        }

        // If old next node existed
        if (oldNextNode != null) {
            // Assert the old next node's previous node should point to the old previous node
            assertEquals(oldNextNode.previous, oldPreviousNode);
        // Else
        } else {
            // Assert the tail should now equal the old previous node
            assertEquals(oldPreviousNode, testList.Tail());
        }

        // Size should decrease by 1.
        assertEquals(TESTARRAY.length - 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteNodeBasedOnValue method.
    public void Remove_SingleElementPositiveIndexExists_IndexIsRemoved() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Random in bounds Index to insert into
        int removeIndex = 0;

        // Act.
        testList.Remove(removeIndex);

        // Assert
        assertTrue(testList.IsEmpty());

        // Size should decrease by 1.
        assertEquals(TESTARRAY.length - 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteNodeBasedOnValue method.
    public void Remove_SingleElementListNegativeIndexExists_ListIsEmpty() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Random in bounds Index to insert into
        int removeIndex = -1;

        // Act.
        testList.Remove(removeIndex);

        // Assert
        assertTrue(testList.IsEmpty());

        // Size should decrease by 1.
        assertEquals(TESTARRAY.length - 1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Remove method.
    public void Remove_SingleElementIndexOutOfBounds_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);
        // Index to test insertion.
        int removeIndex = OUTOFBOUNDSINDEX;
        // State of list before
        String oldList = testList.toString();

        // Act
        testList.Remove(removeIndex);

        // Assert Size should not change.
        assertEquals(TESTARRAY.length, testList.Size());
        // Assert 
        assertEquals(oldList, testList.toString());    }
}
