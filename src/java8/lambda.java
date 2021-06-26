package java8;

import java.util.*;

public class lambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8));

        // single parameter with expression
        list.forEach(e->System.out.println(e));

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        // multiple parameters with expression
        map.forEach((k,v)->System.out.println("Key = " + k + " " + "value = " + v));

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        // using code blocks to write a lines of code in lambda expression
        System.out.println("### Show prime numbers ###");
        list.forEach(e->{
            if(e%2 != 0)
                System.out.println(e);
        });
    }
}
