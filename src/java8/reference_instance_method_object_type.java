package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reference_instance_method_object_type {
    public static void main(String[] args) {
        List<String> personList = new ArrayList<>();
        personList.add("abc");
        personList.add("xyz");
        personList.add("ccc");

        // Method reference to String type
        Collections.sort(personList,
                String::compareToIgnoreCase);
        personList.forEach(System.out::println);
    }
}
