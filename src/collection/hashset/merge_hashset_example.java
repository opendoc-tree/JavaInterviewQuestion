package collection.hashset;

import java.util.HashSet;

public class merge_hashset_example {
    public static void main(String[] args) {

        //first HashSet
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("A");
        hashSet1.add("B");
        hashSet1.add("C");

        //second HashSet
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("D");
        hashSet2.add("E");
        hashSet2.add("F");

        // merge HashSet2 with HashSet1
        hashSet1.addAll(hashSet2);
        for(String element:hashSet1)
        {
            System.out.println(element);
        }
    }
}
