
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private BirdingJournal birdingJournal;
    private Scanner scanner;

    public UserInterface(BirdingJournal birdingJournal, Scanner scanner) {
        this.birdingJournal = birdingJournal;
        this.scanner = scanner;
    }

    private void printObservations(ArrayList<Observations> observationsList) {
        for (Observations observations : observationsList) {
            System.out.println(observations);
        }
    }

    private void addBird() {
        String name, latinName;

        System.out.println("Name:");
        name = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        latinName = this.scanner.nextLine();

        this.birdingJournal.addBird(name, latinName);
    }

    private void addObservation() {
        String name;

        System.out.println("Bird?");
        name = this.scanner.nextLine();
        if (!this.birdingJournal.addObservation(name)) {
            System.out.println("Not a bird!");
        }
    }

    private void printAllBirds() {
        this.printObservations(this.birdingJournal.getObservationsList());
    }

    private void printOneBird() {
        String name;

        System.out.println("Bird?");
        name = this.scanner.nextLine();
        Observations observations = this.birdingJournal.getObservations(name);
        if (observations != null) {
            System.out.println(observations);
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void start() {
        String command = "";

        System.out.println("? ");
        command = this.scanner.nextLine();
        while (!command.equals("Quit")) {
            if (command.equals("Add")) {
                this.addBird();
            } else if (command.equals("Observation")) {
                this.addObservation();
            } else if (command.equals("All")) {
                this.printAllBirds();
            } else if (command.equals("One")) {
                this.printOneBird();
            }

            System.out.println("? ");
            command = this.scanner.nextLine();
        }
    }
}
