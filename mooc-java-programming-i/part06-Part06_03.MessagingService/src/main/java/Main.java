
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService prototype = new MessagingService();
        prototype.add(new Message("Dad", "Hi"));
        prototype.add(new Message("선생님", "밥은 묵고 다니냐"));
        prototype.getMessages();
    }
}
