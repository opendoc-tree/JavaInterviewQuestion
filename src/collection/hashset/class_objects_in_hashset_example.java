package collection.hashset;

import collection.Student;

import java.util.Iterator;
import java.util.HashSet;

public class class_objects_in_hashset_example {
    public static void main(String[] args) {

        //User-defined class objects in HashSet
        HashSet<Student> hashSet = new HashSet<>();

        // add element in HashSet
        hashSet.add(new Student(100,"Sun",20));
        hashSet.add(new Student(101,"Moon",18));
        hashSet.add(new Student(102,"Earth",22));

        // print all element of HashSet using foreach loop
        for(Student student:hashSet)
        {
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

        // print all element of HashSet using iterator
        System.out.println("====== By Iterator ========");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            Student student=(Student) iterator.next();
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

    }
}
