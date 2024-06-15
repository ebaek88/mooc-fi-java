
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        while(true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            if(input == 4) {
                break;
            }
        }
    }
}
