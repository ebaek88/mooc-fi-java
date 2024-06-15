
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int oldest = -1; //sets the olderst ot be -1 first before comparisons
        String oldestName = "";

        while(true) {
            input = scanner.nextLine();
            // if nothing is entered, exits the loop
            if(input.equals("")) {
                break;
            }

            // separates the CSV format by commas
            String[] parts = input.split(",");
            // the age is always at the second element
            int age = Integer.valueOf(parts[1]);
            // compares the oldest and the current
            if(age > oldest) {
                oldest = age;
                oldestName = parts[0];
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
        scanner.close();
    }
}
