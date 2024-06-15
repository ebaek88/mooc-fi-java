
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            //if nothing is entered, exits the loop and the program
            if(input.equals("")) {
                break;
            }

            String[] pieces = input.split(" ");
            for(int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }


    }
}
