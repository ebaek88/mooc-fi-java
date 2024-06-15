
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // asks for the name of the file.
        // stores the name of the file to the variable fileName
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        // now reads the CSV-formatted file.
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            String readLine; // variable stored for each line read
            String name; // variable for the name
            int age; // variable for the age
            while(fileReader.hasNextLine()) {
                readLine = fileReader.nextLine();
                // separates the name and the data from the line
                String[] parts = readLine.split(",");
                // stores the name and the age into separate variables
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                // prints out the name and the age
                System.out.println(name + ", age: " + age + (age == 1 ? " year" : " years"));
            }
        } catch(Exception e) {
            System.out.println("Could not read the file " + fileName);
        }
    }
}
