public class Container {
    private final int LIMIT;
    private int content;

    // constructor
    public Container() {
        LIMIT = 100;
        content = 0;
    }

    // returns the current amount
    public int contains() {
        return content;
    }

    // method to check if the amount to add/remove/move is negative
    public boolean isNegative(int amount) {
        if(amount < 0) {
            return true;
        }

        return false;
    }

    public void add(int amount) {
        // if the amount is negative, do nothing
        if(isNegative(amount)) {
            return;
        }

        // if the amount added makes the container overflow, only hold the limit
        if(amount + content > LIMIT) {
            content = LIMIT;
        } else {
            content += amount;
        }
    }

    public void remove(int amount) {
        // if the amount is negative, do nothing
        if(isNegative(amount)) {
            return;
        }

        // if the amount to remove is more than what the container currently has,
        // remove entirely the current amount
        if(amount > content) {
            amount = content;
        }

        content -= amount;
    }

    // toString
    public String toString() {
        return content + "/" + LIMIT;
    }
}
