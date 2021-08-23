package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_example {
    public static void main(String[] args) {

        //declare String type ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // add data in arraylist
        arrayList.add("A");  // index - 0
        arrayList.add("B");  // index - 1
        arrayList.add("C");  // index - 2

        // count data in arraylist
        System.out.println("count data = "+arrayList.size());

        // get a data from arraylist using index
        System.out.println("Get data of index number 1 = "+arrayList.get(1));

        // find a data in arraylist exist or not
        System.out.println("C is exist = "+arrayList.contains("C"));
        System.out.println("X is exist = "+arrayList.contains("X"));

        // print all data of arraylist using foreach loop
        for(String data:arrayList)
        {
            System.out.println(data);
        }

        // print all data of arraylist using iterator
        System.out.println("By Iterator");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // modify a data in arraylist. change A to X
        arrayList.set(0,"X");
        System.out.println("See result");
        for(String data:arrayList)
        {
            System.out.println(data);
        }

        // remove a data in arraylist. remove C from arraylist
        arrayList.remove("C");
        System.out.println("See result");
        for(String data:arrayList)
        {
            System.out.println(data);
        }

        // clear all data from arraylist.
        arrayList.clear();
        System.out.println("count data in arraylist = "+arrayList.size());
    }
}
