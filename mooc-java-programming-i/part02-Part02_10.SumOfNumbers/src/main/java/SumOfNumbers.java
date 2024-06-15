
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, inputVal = 0;

        while(true) {
            System.out.println("Give a number:");
            inputVal = Integer.valueOf(scanner.nextLine());

            //if 0 is inputted, exits the addition loop
            if(inputVal == 0) {
                break;
            }

            sum += inputVal;
        }

        System.out.println("Sum of the numbers: " + sum);

    }
}
