
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input; // variable for storing the input
        int converted; // variable for the interger converted form the string input
        while(true) {
            input = scanner.nextLine();
            // exits the loop if the input is "end (case-sensitive)"
            if(input.equals("end")) {
                break;
            }

            // converts to int
            converted = Integer.valueOf(input);
            // prints out the cubed value of the integer
            System.out.println(converted * converted * converted);
        }

    }
}
