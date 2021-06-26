import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class diff_traditional_concurrent_collections {
    public static void main(String[] args) {

        // It gives ConcurrentModificationException because traditional collections are not-thread-safe
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        try {
            list.forEach(i -> list.add(i*10));
            System.out.println(list);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        // It not gives any exception because concurrent collections are thread-safe

        List<Integer> conList = new CopyOnWriteArrayList<>();
        conList.add(1);
        conList.add(2);
        conList.add(3);
        conList.add(4);
        conList.add(5);

        try {
            conList.forEach(i -> conList.add(i*10));
            System.out.println(conList);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
