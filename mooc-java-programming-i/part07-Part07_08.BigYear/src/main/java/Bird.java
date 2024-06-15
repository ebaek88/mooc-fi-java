public class Bird {
    private String birdName;
    private String latinName;
    private int numObservation;

    // constructor
    public Bird(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        this.numObservation = 0;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservationNumber() {
        return this.numObservation;
    }

    public void increaseObservation() {
        this.numObservation++;
    }

    public String toString() {
        return this.birdName + " (" + this.latinName + "): " + this.numObservation + " observations";
    }
}
