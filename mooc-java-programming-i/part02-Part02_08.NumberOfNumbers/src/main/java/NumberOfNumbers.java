
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;

        while(true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            //exits when the inputted value is 0
            if(input == 0) {
                break;
            }
            
            count++;
        }

        System.out.println("Number of numbers: " + count);
    }
}
