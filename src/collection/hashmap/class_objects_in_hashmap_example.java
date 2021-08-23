package collection.hashmap;

import collection.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class class_objects_in_hashmap_example {
    public static void main(String[] args) {

        //User-defined class objects as a value in hashmap
        HashMap<Integer,Student> hashMap = new HashMap<>();

        // add element in HashSet
        hashMap.put(1,new Student(100,"Sun",20));
        hashMap.put(2,new Student(101,"Moon",18));
        hashMap.put(3,new Student(102,"Earth",22));

        System.out.println("Iterating Hashmap...");
        for(Map.Entry mp:hashMap.entrySet())
        {
            System.out.println(mp.getKey()+" Details :");
            Student student = (Student) mp.getValue();
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

    }
}
