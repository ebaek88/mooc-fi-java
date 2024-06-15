import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        GradeManager gm = new GradeManager();
        gm.add();
        System.out.println("Point average (all): " + gm.pointAverage());
        
        if(gm.pointAveragePassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gm.pointAveragePassing());
        }

        System.out.println("Pass percentage: " + gm.passPercentage());
        gm.gradeDistribution();

        scanner.close();
    }
}