
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true) {
            input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] nonEmpty = input.split(" ");
            for(String element: nonEmpty) {
                if(element.contains("av")) {
                    System.out.println(element);
                }
            }
        }

    }
}
