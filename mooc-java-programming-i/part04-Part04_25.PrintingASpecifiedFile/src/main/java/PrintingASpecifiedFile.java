
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        // opens a file that has the file name stored in the variable fileName
        try(Scanner scanner2 = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while(scanner2.hasNextLine()) {
                // we read one line
                String row = scanner2.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
        
    }
}
