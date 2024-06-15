
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input;
        int sum = 0, oddCount = 0, evenCount = 0;
        while(true) {
            input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if(input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            sum += input;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + (evenCount + oddCount));
        if((evenCount + oddCount) == 0) {
            System.out.println("Average: " + ((double)sum / 1));
        } else {
            System.out.println("Average: " + ((double)sum / (evenCount + oddCount)));
        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
