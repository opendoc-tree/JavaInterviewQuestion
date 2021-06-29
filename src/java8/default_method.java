package java8;
interface Imessage
{
    default void print()
    {
        System.out.println("Hello World");
    }

    default int sum(int x, int y)
    {
        return x+y;
    }
}
public class default_method implements Imessage{
    public static void main(String[] args) {
        default_method defaultMethod = new default_method();
        defaultMethod.print();
        System.out.println(defaultMethod.sum(10,20));
    }
}
