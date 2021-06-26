package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class bounded_wildcard {

    // this is Upper Bounded Wildcards

    // In this case we only used Number or its subclasses (Integer, Double etc.) as a parameter
    private static Double addUpper(ArrayList<? extends Number> list)
    {
        double sum=0;
        for (Number num:list)
        {
            sum=sum+num.doubleValue();
        }
        return sum;
    }

    // this is Lower Bounded Wildcards

    // In this case we only used Integer and It superclass (Number) as a parameter
    private static int addLower(ArrayList<? super Integer> list)
    {
        int sum=0;
        for (Object num:list)
        {
            sum=sum+ (int) num;
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Number> listNum = new ArrayList(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> listInt = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> listDouble = new ArrayList(Arrays.asList(1.1,2.0,3.2,4.1,5.1));

        System.out.println(addUpper(listNum));
        System.out.println(addUpper(listInt));
        System.out.println(addUpper(listDouble));

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println(addLower(listNum));
        System.out.println(addLower(listInt));
    }
}
