
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // enter first name, last name, and id number
        // if an empty line is entered, exits the loop
        while(true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if(firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println("");
        
        // print the collected personal information
        for(PersonalInformation element: infoCollection) {
            // System.out.println(element.toString().substring(0, element.toString().indexOf("(") - 1));
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }

    }
}
