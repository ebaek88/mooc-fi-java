
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // variable for storing how many strings have been read
        String input; // variable for storing input
        while(true) {
            input = scanner.nextLine();
            // if "end"(case-sensitive) is entered, exits the loop
            if(input.equals("end")) {
                break;
            } else {
                count++;
            }
        }

        // prints the count
        System.out.println(count);
    }
}
