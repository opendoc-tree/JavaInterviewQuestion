import java.util.*;
import java.util.stream.Collectors;

public class remove_duplicate_value_from_list {
    public static void main(String[] args) {
        List<Integer>
                list = new ArrayList(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        //using Java8 Stream Api
        List newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Using Java8 Stream Api");
        newList.forEach(System.out::println);

        System.out.println();

        // Using Set Interface
        Set s = new HashSet(list);
        list.clear();
        list.addAll(s);
        System.out.println("Using Set Interface");
        list.forEach(System.out::println);

    }
}
