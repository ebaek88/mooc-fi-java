
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Prepare the scanner
        List<String> inputList = new ArrayList<>(); // List for storing inputs
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {   // If an empty string is put in, it exits the loop
                break;
            }
            inputList.add(input);   // Otherwise, the scanned input is added to the list
        }

        scanner.close();

        // Prints all the elements of the List
        inputList.stream().forEach(System.out::println);

    }
}
