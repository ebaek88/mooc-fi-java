import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scan;

    // constructor
    public UserInterface(JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    }

    public void start() {
        // receive command input from the user
        String command;
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            command = this.scan.nextLine();

            // if X is typed, exit
            if(command.equals("X")) {
                break;
            } else if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                manager.addJoke(joke);
            } else if(command.equals("2")) {
                System.out.println("Drawing jokes:");
                System.out.println(this.manager.drawJoke());
            } else if(command.equals("3")) {
                System.out.println("Printing the jokes:");
                this.manager.printJokes();
            }
        }
        
    }
}
