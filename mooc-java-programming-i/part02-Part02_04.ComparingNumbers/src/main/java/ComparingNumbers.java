
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstVal = Integer.valueOf(scanner.nextLine());
        int secondVal = Integer.valueOf(scanner.nextLine());

        if(firstVal > secondVal) {
            System.out.println(firstVal + " is greater than " + secondVal + ".");
        } else if(firstVal < secondVal) {
            System.out.println(firstVal + " is smaller than " + secondVal + ".");
        } else {
            System.out.println(firstVal + " is equal to " + secondVal + ".");
        }
    }
}
