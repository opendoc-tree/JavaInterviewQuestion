package java8;

import java.util.Optional;

public class optional_example {
    public static void main(String[] args) {

        Integer num1 = null;
        Integer num2 = 40;

        // Using optional to avoid nullpointer exception at runtime
        int ifNullNum1 = Optional.ofNullable(num1).orElse(10);
        int ifNullNum2 = Optional.ofNullable(num2).orElse(20);
        int sum1 = ifNullNum1 + ifNullNum2;

        System.out.println("Result = " + sum1);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        // it gives a nullpointer exception
        int sum = num1 + num2;

    }
}
