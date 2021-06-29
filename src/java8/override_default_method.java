package java8;

// two interface have default method with same signature
interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}


public class override_default_method implements TestInterface1,TestInterface2{
    public static void main(String[] args) {
        override_default_method defaultMethod = new override_default_method();
        defaultMethod.show();
    }

    // If we use two interface of same signature default method then we create override
    // method in class to call same signature default method
    @Override
    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();
    }
}
