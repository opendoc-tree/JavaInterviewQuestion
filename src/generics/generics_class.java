package generics;

class Gen<T>{
    T obj;
    void add(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return obj;
    }
}

public class generics_class {
    public static void main(String[] args) {
        Gen<String> gen = new Gen<>();
        gen.add("Abc");
        System.out.println(gen.get());

        Gen<Integer> gen1 = new Gen<>();
        gen1.add(10);
        System.out.println(gen1.get());
    }
}
