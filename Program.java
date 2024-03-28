import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4}    ;
        int[] arr2 = new int[3];
       
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(3);
        arrList.add(4);

        ArrayList<Integer> arrayList2 = arrList;

        System.out.println(arrayList2);

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.AddEnd(1);
        myArrayList.AddEnd(3);
        myArrayList.AddEnd(5);
        myArrayList.Print();
        myArrayList.AddStart(4);
        myArrayList.Print();
        myArrayList.AddAtIndex(300, 2);
        myArrayList.Print();
        myArrayList.AddAtIndex(800, -1);
        myArrayList.Print();
        myArrayList.AddAtIndex(900, 1000);
        myArrayList.Print();
        myArrayList.GetAddress();

        for (int i = 0; i < 10; i++){
            myArrayList.AddEnd(0);
        }

        myArrayList.Print();
        myArrayList.GetAddress();

        // while (true) {
            
        // }

        // int *test = 2f92e0f4;
    }



}