
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
                { 3, 2, 7, 6 },
                { 2, 4, 1, 0 },
                { 3, 2, 1, 0 }
        };

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        // a StringBuilder object created
        StringBuilder arrayToString = new StringBuilder();

        for (int row = 0; row < array.length; row++) { // iterates over rows
            for (int col = 0; col < array[row].length; col++) { // iterates over columns in each row
                arrayToString.append(array[row][col]); // append the values to the StringBuilder
            }
            arrayToString.append("\n"); // when each row is iterated, start appending from a new line
        }

        return arrayToString.toString();
    }
}
