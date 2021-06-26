// Abstract class
abstract class Fruit
{
   // constructor in Abstract class
    Fruit(String fruitName)
    {
        System.out.println("Fruit name is - "+fruitName);
    }
    // Abstract method (does not have a body)
    abstract void fruitColor();
    // Regular method
    public void desc()
    {
        System.out.println("This is fruit class");
    }
}
class Mango extends Fruit
{
    Mango(String fruitName) {
        super(fruitName);
    }

    @Override
    void fruitColor() {
        System.out.println("Green");
    }
}
public class abstract_in_java {
    public static void main(String[] args) {
        Mango mango=new Mango("mango");
        mango.desc();
        mango.fruitColor();
    }
}
