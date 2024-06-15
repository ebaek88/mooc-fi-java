
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        while(true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            
            /* if we make a single if-else if-else block like this,
             * it is difficult to define a single, clear task
             
            if(input == 0) {
                break;
            } else if(input < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else {
                System.out.println(input * input);
            */

            //It is desirable to aim for a situation in which
            //every part of the program has a single, clear task.
            
            // The task is to guard and prevent unfit numbers
            // for further processing
            if (input < 0) {
                System.out.println("Unfit number");
                continue;
            }

            // The task is to check if the loop should be exited
            if (input == 0) {
                break;
            }

            // The task is to print the square of the number
            System.out.println(input * input);
            
        }
    }
}
