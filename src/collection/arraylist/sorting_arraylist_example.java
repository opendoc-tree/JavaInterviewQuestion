package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sorting_arraylist_example {
    public static void main(String[] args) {

        //declare second ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("X");
        arrayList.add("Z");
        arrayList.add("Y");

        // Sorting ArrayList
        Collections.sort(arrayList);
        System.out.println("ascending order result");
        for(String element:arrayList)
        {
            System.out.println(element);
        }

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("descending order result");
        for(String element:arrayList)
        {
            System.out.println(element);
        }
    }
}
