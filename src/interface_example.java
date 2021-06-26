interface ifaceA
{
    void msgA();
}
interface ifaceB
{
   void msgB();
}

//An interface can extend from another interface
interface ifaceC extends ifaceB
{
    void msgC();
}

// Java support multiple interface. So, we can use multiple interface on a single class
public class interface_example implements ifaceA,ifaceC {
    public static void main(String[] args) {
        interface_example ie=new interface_example();
        ie.msgA();
        ie.msgB();
        ie.msgC();
    }

    @Override
    public void msgA() {
        System.out.println("from interface A");
    }

    @Override
    public void msgB() {
        System.out.println("from interface B");
    }

    @Override
    public void msgC() {
        System.out.println("from interface C");
    }
}
