package generics;

public class generics_method {

    public static <E> void printArray(E[] elements)
    {
        for(E element:elements)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5,6,7};
        Character chars[] = {'A','B','C','D','E'};
        printArray(nums);
        printArray(chars);
    }
}
