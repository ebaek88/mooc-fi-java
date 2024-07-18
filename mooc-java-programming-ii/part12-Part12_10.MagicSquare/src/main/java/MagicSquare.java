
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    public int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sum = 0;
            for (int col = 0; col < square[row].length; col++) {
                sum += square[row][col];
            }
            rowSums.add(sum);
        }
        return rowSums;
    }// method

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> colSums = new ArrayList<>();
        int[] tempColSums = new int[square.length]; // temporary array to store sums of columns. Sum of elements in
                                                    // column[x] goes to tempColSums[x].

        for (int row = 0; row < square.length; row++) { // iterate over each row of the square array

            for (int col = 0; col < square[row].length; col++) {
                tempColSums[col] += square[row][col];
            }
        }

        for (int i = 0; i < tempColSums.length; i++) { // move from the temp array to the ArrayList
            colSums.add(tempColSums[i]);
        }

        return colSums; // return the column sums
    }// method

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagSums = new ArrayList<>();
        int[] tempDiagSums = new int[2]; // temporary array to store diagonal sums. Index 0 is for the upper left
                                         // diagonal. Index 1 for the upper right.

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                if (row == col) { // adding the upper left diagonal elements
                    tempDiagSums[0] += square[row][col];
                }

                if (row + col == square.length - 1) { // adding the upper right diagonal elements
                    tempDiagSums[1] += square[row][col];
                }
            }
        } // for

        for (int i = 0; i < tempDiagSums.length; i++) { // move from the temp array to the ArrayList
            diagSums.add(tempDiagSums[i]);
        }

        return diagSums; // return the diagonal sums
    }// method

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return -1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
