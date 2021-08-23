package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap_example {
    public static void main(String[] args) {

        // declare hashmap. key type is integer and value type is string
        HashMap<Integer,String> hashMap=new HashMap<>();

        // add element in hashmap
        hashMap.put(101,"Red");
        hashMap.put(102,"White");
        hashMap.put(103,"Green");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry mp:hashMap.entrySet())
        {
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        // get value using key
        System.out.println("find a value by key = "+hashMap.get(101));

        //if key is absent then it put element if same key is present then it does not put element
        hashMap.putIfAbsent(104,"Blue");
        System.out.println("putIfAbsent = "+hashMap);

        // hashmap does not support duplicate key
        hashMap.put(101,"Pink");
        System.out.println("duplicate not support = "+hashMap);

        // replace a element using key
        hashMap.put(101,"Yellow");
        System.out.println("replace element = "+hashMap);

        // remove a element by key
        hashMap.remove(102);
        System.out.println("remove element by key = "+hashMap);

        // remove a element by key and value
        hashMap.remove(103,"Green");
        System.out.println("remove element by key and value = "+hashMap);

    }
}
