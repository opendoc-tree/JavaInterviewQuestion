package java8;

public class reference_static_method {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Static Method Reference
        Sayable sayable=reference_static_method::saySomething;
        sayable.say();
    }
}
