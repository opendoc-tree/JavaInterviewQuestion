package collection.arraylist;

import collection.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class class_objects_in_arraylist_example {
    public static void main(String[] args) {

        //User-defined class objects in ArrayList
        ArrayList<Student> arrayList = new ArrayList<>();

        // add element in arraylist
        arrayList.add(new Student(100,"Sun",20));
        arrayList.add(new Student(101,"Moon",18));
        arrayList.add(new Student(102,"Earth",22));

        // print all element of arraylist using foreach loop
        for(Student student:arrayList)
        {
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

        // print all element of arraylist using iterator
        System.out.println("====== By Iterator ========");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            Student student=(Student) iterator.next();
            System.out.println(student.rolNo+" "+student.name+" "+student.age);
        }

    }
}
