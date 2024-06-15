
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputVal = Integer.valueOf(scanner.nextLine());

        int count = 0;
        while(count <= inputVal) {
            System.out.println(count);
            count++;
        }
    }
}
