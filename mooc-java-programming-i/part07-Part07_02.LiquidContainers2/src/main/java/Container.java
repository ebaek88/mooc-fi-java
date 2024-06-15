public class Container {
    private int liquid; // liquid amount in the container
    private int limit;

    // constructor
    public Container() {
        this.liquid = 0;
        this.limit = 100;
    }

    // returns the amount of liquid in a container as an integer
    public int contains() {
        return this.liquid;
    }

    // add liquid
    public void add(int amount) {

        // first check if the amount is negative
        if(amount < 0) {
            return;
        }

        // check if the first container can hold the additional amount
        if(amount + this.liquid > this.limit) {
            this.liquid = this.limit;
        } else {
            this.liquid = this.liquid + amount;
        }
    }

    // remove liquid
    public void remove(int amount) {

        // first check if the amount is negative
        if(amount < 0) {
            return;
        }

        // check if it needs to move all the remaining liquid of the second container
        if(amount > liquid) {
            amount = liquid;
        }

        liquid = liquid - amount;
    }

    public String toString() {
        return this.liquid + "/" + this.limit;
    }
}