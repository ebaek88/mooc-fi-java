
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, sum = 0;

        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            // if 0, exit the loop
            if(input == 0) {
                break;
            }

            //negative numbers are not counted towards
            if(input < 0) {
                continue;
            }

            sum += input;
            count++;
        }

        if(count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double)sum / count));
        }
    }
}
