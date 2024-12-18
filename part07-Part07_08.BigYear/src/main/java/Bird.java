
public class Bird {

    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + ")";
    }
}
