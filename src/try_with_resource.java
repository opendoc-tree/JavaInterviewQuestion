import java.io.FileOutputStream;

public class try_with_resource {
    public static void main(String[] args) {

        try(FileOutputStream fs=new FileOutputStream("test.txt"))
        // we using resource in try. FileOutputStream automatically close after finishing the program
        {
            String text="Hello World. This is my java program";
            fs.write(text.getBytes());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
