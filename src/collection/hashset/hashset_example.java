package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_example {
    public static void main(String[] args) {

        //declare String type HashSet
        HashSet<String> hashSet = new HashSet<>();

        // add element in HashSet
        hashSet.add("A");  // index - 0
        hashSet.add("B");  // index - 1
        hashSet.add("C");  // index - 2

        // count element in HashSet
        System.out.println("count element = "+hashSet.size());

        // find a element in HashSet exist or not
        System.out.println("C is exist = "+hashSet.contains("C"));
        System.out.println("X is exist = "+hashSet.contains("X"));

        // print all element of HashSet using foreach loop
        for(String element:hashSet)
        {
            System.out.println(element);
        }

        // print all element of HashSet using iterator
        System.out.println("By Iterator");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // remove a element in HashSet. remove C from HashSet
        hashSet.remove("C");
        System.out.println("See result");
        for(String element:hashSet)
        {
            System.out.println(element);
        }

        // clear all element from HashSet.
        hashSet.clear();
        System.out.println("count element in HashSet = "+hashSet.size());
    }
}
