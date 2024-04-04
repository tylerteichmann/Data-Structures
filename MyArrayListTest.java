import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void AddStart_Add_ArrayListToContainOne() {
        // Arrange
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        // Act
        myArrayList.AddStart(20);
        
        // Assert
        assertEquals(myArrayList.Size(), 1);
        assertEquals(myArrayList.GetElementAtIndex(0), 20);
        assertEquals(myArrayList.GetElementAtIndex(0), 20);
        assertEquals(myArrayList.GetElementAtIndex(0), 20);
        assertEquals(myArrayList.GetElementAtIndex(0), 20);
    }
}
