import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // accepts inputs for the name and the duration
        while(true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();
            // exits the loop if an empty line is entered
            if(inputName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int inputDuration = Integer.valueOf(scanner.nextLine());

            // adds to the TelevisionProgram ArrayList
            programs.add(new TelevisionProgram(inputName, inputDuration));
        }

        // prints only the program whose duration is less than or equal to
        // the duration limit set by the user
        System.out.print("Program's maximum duration? ");
        int durationLimit = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram element: programs) {
            if(element.getDuration() <= durationLimit) {
                System.out.println(element);
            }
        }
    }
}
