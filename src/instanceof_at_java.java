public class instanceof_at_java {
    public static void main(String[] args) {
        Red red=new Red();

        // red is instance of Red class
        System.out.println(red instanceof Red);

        // red also instance of Color class because Red is subclass of Color
        System.out.println(red instanceof Color);
    }
}

class Color{}
class Red extends Color{}
