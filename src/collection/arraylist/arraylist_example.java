package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_example {
    public static void main(String[] args) {

        //declare String type ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // add element in arraylist
        arrayList.add("A");  // index - 0
        arrayList.add("B");  // index - 1
        arrayList.add("C");  // index - 2

        // count element in arraylist
        System.out.println("count element = "+arrayList.size());

        // get a element from arraylist using index
        System.out.println("Get element of index number 1 = "+arrayList.get(1));

        // find a element in arraylist exist or not
        System.out.println("C is exist = "+arrayList.contains("C"));
        System.out.println("X is exist = "+arrayList.contains("X"));

        // print all element of arraylist using foreach loop
        for(String element:arrayList)
        {
            System.out.println(element);
        }

        // print all element of arraylist using iterator
        System.out.println("By Iterator");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // modify a element in arraylist. change A to X
        arrayList.set(0,"X");
        System.out.println("See result");
        for(String element:arrayList)
        {
            System.out.println(element);
        }

        // remove a element in arraylist. remove C from arraylist
        arrayList.remove("C");
        System.out.println("See result");
        for(String element:arrayList)
        {
            System.out.println(element);
        }

        // clear all element from arraylist.
        arrayList.clear();
        System.out.println("count element in arraylist = "+arrayList.size());
    }
}
