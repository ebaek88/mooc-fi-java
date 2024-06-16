
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int LIMIT = 100; // sets the limit of the container as a constant
        int firstContainer = 0; // variable for the first container
        int secondContainer = 0; // variable for the second container

        while (true) {

            // first prints out the status of the containers
            System.out.println("First: " + firstContainer + "/" + LIMIT);
            System.out.println("Second: " + secondContainer + "/" + LIMIT);

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // intrepret the command by splitting the word and the number
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // implement the add method
            if(command.equals("add")) {
                if(amount < 0) { // if the amount is negative, do nothing
                    System.out.println();
                    continue;
                }

                // if the amount makes the container overflow, set the container to be its limit
                if(firstContainer + amount > LIMIT) {
                    firstContainer = LIMIT;
                } else {
                    firstContainer += amount;
                }

            }

            // implement the move method
            if(command.equals("move")) {
                if(amount < 0) { // if the amount is negative, do nothing
                    System.out.println();
                    continue;
                }

                // if amount to move is greater than the first container, move all the remaining liquid
                if(amount > firstContainer) {
                    amount = firstContainer;
                }

                // if the amount makes the second container overflow, set the second container to its limit
                if(amount + secondContainer > LIMIT) {
                    secondContainer = LIMIT;
                } else {
                    secondContainer += amount;
                }

                firstContainer -= amount;
            }

            //implement the remove method
            if(command.equals("remove")) {
                if(amount < 0) { // if the amount is negative, do nothing
                    System.out.println();
                    continue;
                }

                // if amount to move is greater than the second container, move all the remaining liquid
                if(amount > secondContainer) {
                    amount = secondContainer;
                }

                secondContainer -= amount;
            }

            System.out.println();
            
        }
    }

}
