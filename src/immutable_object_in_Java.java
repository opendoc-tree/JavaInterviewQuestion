public class immutable_object_in_Java {
    public static void main(String[] args) {
        String s="Sachin";

        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
        /*Here Sachin is not changed but a new object is created with sachintendulkar.
          That is why string is known as immutable.*/

        s=s.concat(" Tendulkar"); //it create a new string object
        System.out.println(s);
        /*In such case, s points to the "Sachin Tendulkar".
            Please notice that still sachin object is not modified.*/
    }
}

