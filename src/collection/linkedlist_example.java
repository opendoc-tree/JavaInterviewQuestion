package collection;

import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist_example {
    public static void main(String[] args) {

        //declare String type LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // add data in LinkedList
        linkedList.add("A");  // index - 0
        linkedList.add("B");  // index - 1
        linkedList.add("C");  // index - 2

        // count data in LinkedList
        System.out.println("count data = "+linkedList.size());

        // get a data from LinkedList using index
        System.out.println("Get data of index number 1 = "+linkedList.get(1));

        // find a data in LinkedList exist or not
        System.out.println("C is exist = "+linkedList.contains("C"));
        System.out.println("X is exist = "+linkedList.contains("X"));

        // print all data of LinkedList using foreach loop
        for(String data:linkedList)
        {
            System.out.println(data);
        }

        // print all data of LinkedList using iterator
        System.out.println("By Iterator");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // modify a data in LinkedList. change A to X
        linkedList.set(0,"X");
        System.out.println("See result");
        for(String data:linkedList)
        {
            System.out.println(data);
        }

        // remove a data in LinkedList. remove C from LinkedList
        linkedList.remove("C");
        System.out.println("See result");
        for(String data:linkedList)
        {
            System.out.println(data);
        }

        // clear all data from LinkedList.
        linkedList.clear();
        System.out.println("count data in LinkedList = "+linkedList.size());
    }
}
