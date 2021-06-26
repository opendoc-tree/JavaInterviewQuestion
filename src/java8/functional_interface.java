package java8;
// A functional interface must be have one abstract method
interface Square
{
    // abstract method
    int calculate(int x);
}
public class functional_interface {
    public static void main(String[] args) {
        Square s= e->e*e;
        System.out.println(s.calculate(5));
    }
}
