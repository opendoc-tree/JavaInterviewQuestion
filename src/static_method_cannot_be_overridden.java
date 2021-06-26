/* Java program to show that if static method is redefined by
a subclass, then it is not overriding. */

// Superclass
class Base {

    public static void display() {
        System.out.println("Static or class method from Base");
    }

}

// Subclass
class Derived extends Base {

    public static void display() {
        System.out.println("Static or class method from Derived");
    }

}

// Driver class
public class static_method_cannot_be_overridden {
    public static void main(String args[ ]) {
        Base obj1 = new Derived();

        // As per overriding rules this should call to subclass static
        // overridden method. Since static method can not be overridden, it
        // calls superclass display()
        obj1.display();

    }
}
