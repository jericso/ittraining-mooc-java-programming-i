
import java.util.ArrayList;

public class BirdingJournal {

    private ArrayList<Observations> observationsList;

    public BirdingJournal() {
        this.observationsList = new ArrayList<>();
    }

    private int birdIndex(String name) {
        for (int i = 0; i < this.observationsList.size(); i++) {
            if (this.observationsList.get(i).getBird().getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public ArrayList<Observations> getObservationsList() {
        return this.observationsList;
    }

    public Observations getObservations(String name) {
        int birdIndex = this.birdIndex(name);
        if (birdIndex != -1) {
            return this.observationsList.get(birdIndex);
        } else {
            return null;
        }
    }

    public void addBird(String name, String latinName) {
        if (this.birdIndex(name) == -1) {
            Bird newBird = new Bird(name, latinName);
            Observations newObservations = new Observations(newBird);
            this.observationsList.add(newObservations);
        }
    }

    public boolean addObservation(String name) {
        int birdIndex = this.birdIndex(name);
        if (birdIndex == -1) {
            return false;
        } else {
            this.observationsList.get(birdIndex).addObservation();
            return true;
        }
    }
}
