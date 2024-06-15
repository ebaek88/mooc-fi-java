
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        uiStart(scan);
        
    }

    public static void uiStart(Scanner scan) {
        BirdDatabase database = new BirdDatabase();

        // start the interface
        while(true) {
            System.out.println("Select the keyword and type it precisely");
            System.out.println("Add - add a bird");
            System.out.println("All - list all the birds");
            System.out.println("One - find a bird");
            System.out.println("Observation - observe a bird");
            System.out.println("Quit - exit the program");
            System.out.println();
            System.out.print("Select the menu: ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")) {
                break;
            } else if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                database.addBird(name, latin);
            } else if(command.equals("All")) {
                database.listBirds();
            } else if(command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.findBird(name);
            } else if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.observeBird(name);
            } else {
                System.out.println("Wrong keyword. Please enter it again.");
            }

            System.out.println();
        }
    }

}
