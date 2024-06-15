
public class HealthStation {
    private int countWeighings = 0; // counts the number of weighings

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.countWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        // increases the weight of the parameter(Person) by one
        person.setWeight(person.getWeight() + 1);
    }

    // returns the number of weighings
    public int weighings() {
        return this.countWeighings;
    }

}
