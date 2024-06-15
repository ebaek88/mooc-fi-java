import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary simpleDic;

    public TextUI(Scanner scan, SimpleDictionary simpleDic) {
        this.scan = scan;
        this.simpleDic = simpleDic;
    }

    public void start() {
        
        String command = ""; // variable for storing the command

        while(true) {
            System.out.print("Command: ");
            command = scan.nextLine();

            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            processCommand(command);

        }
    }

    public void processCommand(String command) {
        if(command.equals("add")) {
            add();
        } else if(command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scan.nextLine();
        System.out.print("Translation: ");
        String translation = scan.nextLine();
        this.simpleDic.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = scan.nextLine();
        // the get method of HashMap returns null if there is no such key
        String searchResult = this.simpleDic.translate(word);
        if(searchResult == null) {
            System.out.println("Word " + word + " was not found");
        } else{
            System.out.println("Translation: " + searchResult);
        }
    }
}