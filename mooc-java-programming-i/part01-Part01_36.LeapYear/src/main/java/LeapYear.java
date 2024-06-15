
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        //first, if the year is not divisible by 4, it is not a leap year
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 != 0) { //if the year is divisible by 4 but not by 100, leap year
            System.out.println("The year is a leap year.");
        } else if (year % 400 == 0) { //if the year is divisible by 100 and 400, leap year
            System.out.println("The year is a leap year.");
        } else { //if the year is divisible by 100 but not by 400, not a leap year
            System.out.println("The year is not a leap year.");
        }

        /*model solution

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a leap year.");
            } else {
            System.out.println("The year is not a leap year.");
            }

        */
    }
}
