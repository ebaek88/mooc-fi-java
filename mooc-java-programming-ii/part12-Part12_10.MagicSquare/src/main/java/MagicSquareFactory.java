
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size); // the width/height of the square must be an odd integer

        // implement the creation of a magic square with the Siamese method algorithm
        // here
        // Start position : row = top row, column = center of the square
        int row = 0;
        int col = size / 2;
        for (int i = 0; i < size * size; i++) { // assign numbers 1..size
            square.placeValue(col, row, i + 1);
            // the next position should be one right and one up
            int nextRow = row - 1; // variable for the next row
            int nextCol = col + 1; // variable for the next column

            // However, if we are at the right edge or the top edge, we have to go over them
            // and
            // continue from the left/bottom edge.
            if (row == 0) {
                nextRow = size - 1;
            }

            if (col == size - 1) {
                nextCol = 0;
            }

            // Check if there already exists a value in the next cell.
            // If the next position already has a value, it needs to go one down.
            if (square.readValue(nextCol, nextRow) != 0) {
                // if the current row is at the bottom, the next row should be at the top
                if (row == size - 1) {
                    nextRow = 0;
                } else {
                    nextRow = row + 1;
                    nextCol = col;
                }
            }

            // After assigning a value, change the position
            row = nextRow;
            col = nextCol;
        }

        return square; // return the magic square
    }

}
