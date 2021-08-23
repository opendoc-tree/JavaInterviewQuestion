package collection.linkedlist;

import java.util.LinkedList;

public class merge_linkedlist_example {
    public static void main(String[] args) {

        //first LinkedList
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");

        //second LinkedList
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("D");
        linkedList2.add("E");
        linkedList2.add("F");

        // merge LinkedList2 with LinkedList1
        linkedList1.addAll(linkedList2);
        for(String data:linkedList1)
        {
            System.out.println(data);
        }
    }
}
