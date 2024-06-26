
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    // Implements comparTo method by comparing wage
    // In order to sort from largest to smallest instead of from smallest to largest,
    // the method returns positive if the wage of the object being compared is LARGER than that of this object
    @Override
    public int compareTo(Human compared) {
        return compared.getWage() - this.getWage(); // instead of this.getWage() - compared.getWage()
    }
}
