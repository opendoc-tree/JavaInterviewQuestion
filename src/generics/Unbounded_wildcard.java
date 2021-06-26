package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unbounded_wildcard {

    // this is Unbounded Wildcards
    // In this case we can use any type
    private static void print(List<?> list)
    {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> listI = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        List<Double> listD = new ArrayList(Arrays.asList(1.1,2.2,3.1,4.0));
        List<String> listS = new ArrayList(Arrays.asList("A","B","C","D"));

        print(listI);
        print(listD);
        print(listS);
    }
}
