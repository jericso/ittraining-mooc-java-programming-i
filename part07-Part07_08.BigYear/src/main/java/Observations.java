
public class Observations {

    private Bird bird;
    private int observationCount;

    public Observations(Bird bird) {
        this.bird = bird;
        this.observationCount = 0;
    }

    public Bird getBird() {
        return this.bird;
    }

    @Override
    public String toString() {
        return this.bird + ": " + this.observationCount + " observations";
    }

    public void addObservation() {
        this.observationCount++;
    }
}
