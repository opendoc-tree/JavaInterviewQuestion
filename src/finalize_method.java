public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm=new finalize_method();
        // Nullifying the reference variable
        fm=null;
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }
}
