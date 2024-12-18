
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdingJournal birdingJournal = new BirdingJournal();
        UserInterface ui = new UserInterface(birdingJournal, scan);

        ui.start();
    }
}
