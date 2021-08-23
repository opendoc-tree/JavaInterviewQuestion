package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_example {
    public static void main(String[] args) {

        //declare String type HashSet
        HashSet<String> hashSet = new HashSet<>();

        // add data in HashSet
        hashSet.add("A");  // index - 0
        hashSet.add("B");  // index - 1
        hashSet.add("C");  // index - 2

        // count data in HashSet
        System.out.println("count data = "+hashSet.size());

        // find a data in HashSet exist or not
        System.out.println("C is exist = "+hashSet.contains("C"));
        System.out.println("X is exist = "+hashSet.contains("X"));

        // print all data of HashSet using foreach loop
        for(String data:hashSet)
        {
            System.out.println(data);
        }

        // print all data of HashSet using iterator
        System.out.println("By Iterator");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // remove a data in HashSet. remove C from HashSet
        hashSet.remove("C");
        System.out.println("See result");
        for(String data:hashSet)
        {
            System.out.println(data);
        }

        // clear all data from HashSet.
        hashSet.clear();
        System.out.println("count data in HashSet = "+hashSet.size());
    }
}
