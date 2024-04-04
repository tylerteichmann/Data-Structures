import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        myLinkedList.AddFront("it's me");
        myLinkedList.AddFront("I'm the problem");
        myLinkedList.AddFront("hi");
        myLinkedList.AddFront("It's me");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.Size());

        // // int[] arr = {1, 3, 4}    ;
        // // int[] arr2 = new int[3];
       
        // // System.out.println(Arrays.toString(arr));
        // // System.out.println(Arrays.toString(arr2));
        
        // ArrayList<Integer> arrList = new ArrayList<Integer>();

        // arrList.add(1);
        // arrList.add(3);
        // arrList.add(4);

        // // ArrayList<Integer> arrayList2 = arrList;

        // // System.out.println(arrayList2);

        // MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        // System.out.println(myArrayList.Size());
        // myArrayList.AddEnd(3);
        // myArrayList.AddEnd(7);
        // myArrayList.AddEnd(1);
        // // myArrayList.Print();
        // myArrayList.AddStart(2);
        // // myArrayList.Print();
        // myArrayList.AddAtIndex(300, 2);
        // // myArrayList.Print();
        // myArrayList.AddAtIndex(800, -1);
        // // myArrayList.Print();
        // myArrayList.AddAtIndex(900, 1000);
        // myArrayList.Print();
        // System.out.println(myArrayList.Size());

        // try {
        //     myArrayList.DeleteAtIndex(3);
        //     myArrayList.Print();
        //     myArrayList.DeleteAtStart();
        //     myArrayList.Print();
        //     // check if its empty before we have cleared our elements
        //     System.out.println(myArrayList.IsEmpty());
        //     myArrayList.DeleteAtEnd();
        //     myArrayList.Print();
        //     System.out.println(myArrayList.Size());
        // } catch (Exception exception) {
        //     System.out.println(exception);
        // }

        // myArrayList.ClearAll();
        // myArrayList.Print();
        // System.out.println(myArrayList.Size());
        // // Check if its empty after we have cleared out our elements
        // System.out.println(myArrayList.IsEmpty());

        // // System.out.println(myArrayList.GetElementAtIndex(1));

        // MyArrayList<String> myStringList = new MyArrayList<String>();
        // myStringList.AddStart("Hello");
        // myStringList.AddEnd("World!");
        // myStringList.AddAtIndex("Beautiful", 1);
        // myStringList.Print();
        // System.out.println(myStringList.Size());
        // myStringList.DeleteAtEnd();
        // myStringList.Print();
        // myStringList.ClearAll();
        // myStringList.Print();

    }
}