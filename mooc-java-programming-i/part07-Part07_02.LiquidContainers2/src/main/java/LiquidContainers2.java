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
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            // implement adding
            if (parts[0].equals("add")) {
                firstContainer.add(amount);
            }

            // implement moving
            if(parts[0].equals("move")) {
                if(amount > firstContainer.contains()) {
                    amount = firstContainer.contains();
                }
                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            // implement removing
            if(parts[0].equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}