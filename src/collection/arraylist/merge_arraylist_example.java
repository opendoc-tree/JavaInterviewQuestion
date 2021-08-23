package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class merge_arraylist_example {
    public static void main(String[] args) {

        //first ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");

        //second ArrayList
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("D");
        arrayList2.add("E");
        arrayList2.add("F");

        // merge arraylist2 with arraylist1
        arrayList1.addAll(arrayList2);
        for(String data:arrayList1)
        {
            System.out.println(data);
        }
    }
}
