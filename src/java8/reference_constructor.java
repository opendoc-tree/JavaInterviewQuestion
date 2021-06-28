package java8;
interface IMessage{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class reference_constructor {
    public static void main(String[] args) {
        IMessage message=Message::new;
        message.getMessage("Hello");
    }
}
