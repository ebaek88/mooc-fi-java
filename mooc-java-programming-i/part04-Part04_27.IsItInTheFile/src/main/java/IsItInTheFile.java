
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        // first read the file of the file name stored in the variable file
        try(Scanner readFile = new Scanner(Paths.get(file))) {
            boolean hasTheWord = false;
            while(readFile.hasNextLine()) {
                String line = readFile.nextLine();
                if(line.contains(searchedFor)) {
                    hasTheWord = true;
                    System.out.println("Found!");
                    break;
                }
            }

            // prints out the message when the word in query is not found
            if(hasTheWord == false) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}
