
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int lowerLim, upperLim;
        System.out.print("Where to? ");
        upperLim = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        lowerLim = Integer.valueOf(scanner.nextLine());

        int counter = lowerLim;
        while(counter <= upperLim) {
            System.out.println(counter);
            counter++;
        }
    }
}
