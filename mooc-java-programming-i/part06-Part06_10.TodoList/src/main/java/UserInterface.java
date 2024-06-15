import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scan;
    
    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start() {
        String command = ""; // variable to store commands
        while(true) {
            System.out.print("Command: ");
            command = scan.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }

    public void processCommand(String word) {
        if(word.equals("add")) {
            add();
        } else if(word.equals("list")) {
            list();
        } else if(word.equals("remove")) {
            remove();
        } else {
            System.out.println("Wrong command. Please type again.");
        }
    }

    public void add() {
        System.out.print("To add: ");
        String addTask = scan.nextLine();
        todoList.add(addTask);
    }

    public void list() {
        todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int removeIndex = Integer.valueOf(scan.nextLine());
        todoList.remove(removeIndex);
    }
}
