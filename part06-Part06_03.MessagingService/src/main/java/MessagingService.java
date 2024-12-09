/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        messages = new ArrayList<>();
    }

    // Adds a message passed as a parameter to the messaging service as long 
    // as the message content is at most 280 characters long.
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    //  Returns the messages added to the messaging service.
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
