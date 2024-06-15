
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true) {
            input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }
        
        scanner.close();

    }
}
