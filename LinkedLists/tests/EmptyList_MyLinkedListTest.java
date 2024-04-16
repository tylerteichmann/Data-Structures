// Tyler J. Teichmann

// Import Test for testing methods.
import org.junit.Test;
// Import assertEquals for testing methods.
import static org.junit.Assert.assertEquals;
// Import assertTrue for testing methods.
import static org.junit.Assert.assertTrue;
// Import assertNull for testing methods.
import static org.junit.Assert.assertNull;

// Public class for the Tests.
public class EmptyList_MyLinkedListTest {

    // Constant for testing adding to the list
    public final Integer TESTINTEGER = 4;

    // Annotation for test method.
    @Test
    // Test method for default constructor
    public void MyLinkedList_NoInput_CreateEmptyList() {
        // Arrange

        // Act
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Assert
        assertTrue(testList instanceof MyLinkedList);
    }

    // Annotation for test method.
    @Test
    // Test method for ToString method
    public void ToString_EmptyList_EmptyBrackets() {
        //Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertTrue("[  ]".equals(testList.toString()));
    }

    // Annotation for test method.
    @Test
    // Test method for Head method
    public void Head_EmptyList_HeadPointsToNull(){
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertNull(testList.Head());
    }

    // Annotation for test method.
    @Test
    // Test method for Tail method
    public void Tail_EmptyList_TailPointsToNull() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertNull(testList.Tail());
    }

    // Annotation for test method.
    @Test
    // Test method for ForwardTraverse method
    public void ForwardTraverse_FilledList_BracketsWithElements() {
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert
        assertEquals(testList.ForwardTraverse(), "[  ]");
    }

    // Annotation for test method.
    @Test
    // Test method for ReverseTraverse method
    public void ReverseTraverse_FilledList_BracketsWithElements() {
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert
        assertEquals(testList.ReverseTraverse(), "[  ]");
    }

    // Annotation for test method.
    @Test
    // Test method for Size method
    public void Size_EmptyList_Zero() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertEquals(0, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for IsEmpty method
    public void IsEmpty_EmptyList_True() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_EmptyList_ReturnsNull() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertNull(testList.Get(10));
    }

    // Annotation for test method.
    @Test
    // Test method for AddFront method
    public void AddFront_EmptyList_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.AddFront(TESTINTEGER);

        // Assert head equals the test integer.
        assertEquals(TESTINTEGER, testList.Head().data);
        // Assert head's next node points to null.
        assertNull(testList.Head().next);
        // Assert head's previous node points to null.
        assertNull(testList.Head().previous);

        // Assert tail equals the test integer.
        assertEquals(TESTINTEGER, testList.Tail().data);
        // Assert tail's next node points to null.
        assertNull(testList.Tail().next);
        // Assert tail's next node points to null.
        assertNull(testList.Tail().previous);

        // Assert size equals 1.
        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Append_EmptyList_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.Append(TESTINTEGER);

        // Assert head equals the test integer.
        assertEquals(TESTINTEGER, testList.Head().data);
        // Assert head's next node points to null.
        assertNull(testList.Head().next);
        // Assert head's previous node points to null.
        assertNull(testList.Head().previous);

        // Assert tail equals the test integer.
        assertEquals(TESTINTEGER, testList.Tail().data);
        // Assert tail's next node points to null.
        assertNull(testList.Tail().next);
        // Assert tail's previous node points to null.
        assertNull(testList.Tail().previous);

        // Assert size equals 1.
        assertEquals(1, testList.Size());    }

    // Annotation for test method.
    @Test
    // Test method for Insert method with a positive index.
    public void Insert_EmptyListWithPositiveIndex_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        // Index to test insertion.
        int insertIndex = 0;

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert head equals the test integer.
        assertEquals(TESTINTEGER, testList.Head().data);
        // Assert head's next node points to null.
        assertNull(testList.Head().next);
        // Assert head's previous node points to null.
        assertNull(testList.Head().previous);

        // Assert tail equals the test integer.
        assertEquals(TESTINTEGER, testList.Tail().data);
        // Assert tail's next node points to null.
        assertNull(testList.Tail().next);
        // Assert tail's previous node points to null.
        assertNull(testList.Tail().previous);

        // Assert size equals 1.
        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Insert method with a negative index.
    public void Insert_EmptyListWithNegativeIndex_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        // Index to test insertion.
        int insertIndex = -1;

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert.
        // Assert head equals the test integer.
        assertEquals(TESTINTEGER, testList.Head().data);
        // Assert head's next node points to null.
        assertNull(testList.Head().next);
        // Assert head's previous node points to null.
        assertNull(testList.Head().previous);

        // Assert tail equals the test integer.
        assertEquals(TESTINTEGER, testList.Tail().data);
        // Assert tail's next node points to null.
        assertNull(testList.Tail().next);
        // Assert tail's previous node points to null.
        assertNull(testList.Tail().previous);

        // Assert size equals 1.
        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Insert method with an index out of bounds.
    public void Insert_EmptyListWithIndexOutOfBounds_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        // Index to test insertion.
        int insertIndex = 10;

        // Act
        testList.Insert(insertIndex, TESTINTEGER);
    
        // Assert list should be empty
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteFront method.
    public void DeleteFront_EmptyList_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act
        testList.DeleteFront();

        // Assert.
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteBack method.
    public void DeleteBack_EmptyList_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act
        testList.DeleteBack();

        // Assert.
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for DeleteNodeBasedOnValue method.
    public void DeleteNodeBasedOnValue_EmptyList_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act
        testList.DeleteNodeBasedOnValue(10);

        // Assert.
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for Remove method.
    public void Remove_EmptyList_ListDoesNotChange() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        // Index to test insertion.
        int removeIndex = 10;

        // Act
        testList.Remove(removeIndex);

        // Assert.
        assertTrue(testList.IsEmpty());
    }
}
