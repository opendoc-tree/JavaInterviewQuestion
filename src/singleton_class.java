class Singleton{
  private static Singleton singleton = null;
  public String message;

    public Singleton() {
        this.message = "Example of singleton class";
    }

    public static Singleton instance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}
public class singleton_class {
    public static void main(String[] args) {
        // A singleton class have one object
        Singleton singleton = Singleton.instance();
        System.out.println(singleton.message);
    }
}
