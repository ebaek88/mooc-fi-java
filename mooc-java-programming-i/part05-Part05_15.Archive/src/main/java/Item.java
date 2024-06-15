public class Item {
    private String identifier;
    private String name;

    // constructor
    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }

    // overrides the equals method
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item)compared;

        if(this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        return false;
    }

    // overrides the toString method
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
