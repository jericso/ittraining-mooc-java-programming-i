
public class Main {

    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        messagingService.add(new Message("Jason", "Hi there!"));
        messagingService.add(new Message("Fred", "What's up?"));

        for (Message message : messagingService.getMessages()) {
            System.out.println(message);
        }
    }
}
