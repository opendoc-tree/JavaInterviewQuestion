package java8;

class Print {
    public void saySomething()
    {
        System.out.println("Hello, this is non-static method.");
    }
}
public class reference_instance_method {
    public static void main(String[] args) {
        Print print=new Print();

        // Reference to an instance method of a particular object
        Sayable sayable = print::saySomething;
        sayable.say();
    }
}
