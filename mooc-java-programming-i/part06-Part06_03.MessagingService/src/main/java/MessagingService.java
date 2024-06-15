import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> inbox;

    // constructor
    public MessagingService() {
        inbox = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            inbox.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return inbox;
    }
}
