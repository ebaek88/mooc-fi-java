
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true) {
            input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }

            int inputValue = Integer.valueOf(input);
            System.out.println(inputValue * inputValue * inputValue);
        }
    }
}
