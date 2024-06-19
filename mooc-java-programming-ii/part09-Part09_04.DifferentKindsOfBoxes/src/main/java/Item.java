
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object comparedObject) {
        //first check if the two have the same references
        if(this == comparedObject) {
            return true;
        }

        //if the type of compardObject is different from the object calling equals, return false
        if(!(comparedObject instanceof Item)) {
            return false;
        }

        //cast comparedObject to the type of the object calling equals
        Item comparedItem = (Item) comparedObject;

        //check if the instance variables of the objects are the same (excluding the weight)
        if(this.name.equals(comparedItem.name)) {
            return true;
        }

        //otherwise, the two objects are not the same
        return false;
    }

    @Override
    public int hashCode() {
       return this.name.hashCode(); 
    }

}
