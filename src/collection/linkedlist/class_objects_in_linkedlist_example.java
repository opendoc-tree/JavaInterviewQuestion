package collection.linkedlist;

import collection.Student;

import java.util.LinkedList;
import java.util.Iterator;

public class class_objects_in_linkedlist_example {
    public static void main(String[] args) {

        //User-defined class objects in LinkedList
        LinkedList<Student> linkedList = new LinkedList<>();

        // add element in LinkedList
        linkedList.add(new Student(100,"Sun",20));
        linkedList.add(new Student(101,"Moon",18));
        linkedList.add(new Student(102,"Earth",22));

        // print all element of LinkedList using foreach loop
        for(Student student:linkedList)
        {
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

        // print all element of LinkedList using iterator
        System.out.println("====== By Iterator ========");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            Student student=(Student) iterator.next();
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

    }
}
