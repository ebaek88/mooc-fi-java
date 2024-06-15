
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        // trakcs total sum
        Statistics totalStatistics = new Statistics();
        // tracks sum of even numbers
        Statistics evenStatistics = new Statistics();
        // tracks sum of odd numbers
        Statistics oddStatistics = new Statistics();

        int input;
        System.out.println("Enter numbers:");
        while(true) {
            input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }

            if(input % 2 == 0) {
                totalStatistics.addNumber(input);
                evenStatistics.addNumber(input);
            } else {
                totalStatistics.addNumber(input);
                oddStatistics.addNumber(input);
            }

        }

        System.out.println("Sum: " + totalStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
