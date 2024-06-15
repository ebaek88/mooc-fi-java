
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //accepts input
        String input = "";
        // variable to store the longest name
        String longest = "";
        // variable to store the sum of the birth years
        int birthYear = 0;
        // variable to store the number of person
        int count = 0;

        //takes CSV format until an empty line is entered
        while(true) {
            input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }

            // separates the name and the birth year by splitting on commas
            String[] csvParts = input.split(",");
            // compares the current string and the longest
            if(csvParts[0].length() > longest.length()) {
                longest = csvParts[0];
            }

            count++;
            birthYear = birthYear + Integer.valueOf(csvParts[1]);
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * birthYear / count));

    }
}
