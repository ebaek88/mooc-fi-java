
public class Statistics {
    private int count;
    private int sum;

    // constructor. initialize the variable numberCount here
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    // getter method for the count variable
    public int getCount() {
        return count;
    }

    // getter method for the sum variable
    public int sum() {
        return sum;
    }

    public double average() {
        // since 0 cannot be a denominator, we should separate such case
        if(count == 0) {
            return 0;
        }

        return 1.0 * sum / count;
    }
}
