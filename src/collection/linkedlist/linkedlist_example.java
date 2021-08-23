package collection.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist_example {
    public static void main(String[] args) {

        //declare String type LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // add element in LinkedList
        linkedList.add("A");  // index - 0
        linkedList.add("B");  // index - 1
        linkedList.add("C");  // index - 2

        // count element in LinkedList
        System.out.println("count element = "+linkedList.size());

        // get a element from LinkedList using index
        System.out.println("Get element of index number 1 = "+linkedList.get(1));

        // find a element in LinkedList exist or not
        System.out.println("C is exist = "+linkedList.contains("C"));
        System.out.println("X is exist = "+linkedList.contains("X"));

        // print all element of LinkedList using foreach loop
        for(String element:linkedList)
        {
            System.out.println(element);
        }

        // print all element of LinkedList using iterator
        System.out.println("By Iterator");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // modify a element in LinkedList. change A to X
        linkedList.set(0,"X");
        System.out.println("See result");
        for(String element:linkedList)
        {
            System.out.println(element);
        }

        // remove a element in LinkedList. remove C from LinkedList
        linkedList.remove("C");
        System.out.println("See result");
        for(String element:linkedList)
        {
            System.out.println(element);
        }

        // clear all element from LinkedList.
        linkedList.clear();
        System.out.println("count element in LinkedList = "+linkedList.size());
    }
}
