public class Counter {
    private int value;

    // constructor 1
    public Counter(int startValue) {
        this.value = startValue;
    }

    // constructor 2. overloaded constructor 1
    public Counter() {
        this(0);
    }

    // getter for the value
    public int value() {
        return this.value;
    }

    // increases by parameter
    public void increase(int increaseBy) {
        if(increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    // decreases by parameter
    public void decrease(int decreaseBy) {
        if(decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }
    
    // increases the volume by 1
    public void increase() {
        this.increase(1);
    }

    // decreases the volume by 1
    public void decrease() {
        this.decrease(1);
    }

    public String toString() {
        return "" + this.value();
    }
}
