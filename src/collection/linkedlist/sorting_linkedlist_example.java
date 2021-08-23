package collection.linkedlist;

import java.util.LinkedList;
import java.util.Collections;

public class sorting_linkedlist_example {
    public static void main(String[] args) {

        //declare second LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Z");
        linkedList.add("Y");

        // Sorting LinkedList
        Collections.sort(linkedList);
        System.out.println("ascending order result");
        for(String data:linkedList)
        {
            System.out.println(data);
        }

        Collections.sort(linkedList,Collections.reverseOrder());
        System.out.println("descending order result");
        for(String data:linkedList)
        {
            System.out.println(data);
        }
    }
}
