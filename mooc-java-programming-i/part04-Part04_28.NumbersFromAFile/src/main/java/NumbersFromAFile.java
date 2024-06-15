
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // read a txt file with the name stored in the variable file
        try(Scanner readFile = new Scanner(Paths.get(file))){
            int count = 0; // variable for counting the number of numbers within the range
            int readFromFile; // variable for the number read from the txt file
            while(readFile.hasNextLine()) {
                readFromFile = Integer.valueOf(readFile.nextLine());
                if(readFromFile >= lowerBound && readFromFile <= upperBound) {
                    count++;
                }
            }

            System.out.println("Numbers: " + count);

        } catch(Exception e) {
            System.out.println("Could not find the file " + file);
        }

        scanner.close();
    }

}
