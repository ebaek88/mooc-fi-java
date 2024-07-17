
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random ranGenerator;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        ranGenerator = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while (true) {
            if (numbers.size() >= 7) {
                break; // if seven numbers are already created, it no longer generates a random number
            }
            // Generate a random integer between 1 and 40. There should not be a duplicate
            // number in the list.
            int ranNum = ranGenerator.nextInt(40) + 1;
            if (!containsNumber(ranNum)) {
                numbers.add(ranNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}