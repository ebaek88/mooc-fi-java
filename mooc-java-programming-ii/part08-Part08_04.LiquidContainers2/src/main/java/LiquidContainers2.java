
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            System.out.print("> ");

            String input = scan.nextLine();
            // quits the program, if "quit" is entered
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if(command.equals("add")) {
                firstContainer.add(amount);
            }

            if(command.equals("move")) {
                // if the amount to move is greater than the current content of firstContainer,
                // set the amount to the current content of firstContainer
                // this needs to be done because the remove method does not return anything.
                if(amount > firstContainer.contains()) {
                    amount = firstContainer.contains();
                }

                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            if(command.equals("remove")) {
                secondContainer.remove(amount);
            }

            System.out.println();

        }
    }

}
