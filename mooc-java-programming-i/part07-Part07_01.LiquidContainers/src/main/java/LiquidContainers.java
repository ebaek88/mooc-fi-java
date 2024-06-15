import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;

        while (true) {
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            // implement adding
            if (parts[0].equals("add")) {
                
                // first check if the amount is negative
                if(amount < 0) {
                    continue;
                }

                // check if the first container can hold the additional amount
                if(amount + first > 100) {
                    first = 100;
                } else {
                    first = first + amount;
                }
            }

            // implement moving
            if(parts[0].equals("move")) {

                // first check if the amount is negative
                if(amount < 0) {
                    continue;
                }

                // check if it needs to move all the remaining liquid of the first container
                if(amount > first) {
                    amount = first;
                }

                // check if the second container can hold the additional amount
                if(amount + second > 100) {
                    second = 100;
                } else {
                    second = second + amount;
                }

                first = first - amount;
            }

            // implement removing
            if(parts[0].equals("remove")) {

                // first check if the amount is negative
                if(amount < 0) {
                    continue;
                }

                // check if it needs to move all the remaining liquid of the second container
                if(amount > second) {
                    amount = second;
                }

                second = second - amount;

            }
        }
    }

}