import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scan;

    // constructor
    public UserInterface(TodoList toDoList, Scanner scan) {
        this.toDoList = toDoList;
        this.scan = scan;
    }

    // start the UI
    public void start() {
        String command; // variable for storing the input

        while(true) {
            System.out.print("Command: ");
            command = scan.nextLine();
            
            // exits the program if the command is "stop"
            if(command.equals("stop")) {
                break;
            }

            // add
            if(command.equals("add")) {
                System.out.print("To add: ");
                command = scan.nextLine();
                toDoList.add(command);
                continue;
            }

            // list
            if(command.equals("list")) {
                toDoList.print();
                continue;
            }

            // remove
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskToRemove = Integer.valueOf(scan.nextLine());
                
                if(taskToRemove < 1 || taskToRemove > toDoList.getList().size()) {
                    System.out.println("Task number " + taskToRemove + " does not exist. Please put the correct number again.");
                    continue;
                }

                toDoList.remove(taskToRemove);
                continue;
            }

            // if anything else is entered, ask to type the correct keyword
            System.out.println("Wrong command entered. Please enter the correct keyword(lowercase).");
            

        }
    }

}
