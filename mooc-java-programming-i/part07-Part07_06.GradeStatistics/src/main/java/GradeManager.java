import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
    private ArrayList<Integer> gradeList;

    // constructor
    public GradeManager() {
        gradeList = new ArrayList<>();
    }

    Scanner scan = new Scanner(System.in);

    // add points until -1 is entered
    // only numbers between 0 - 100 are acceptable
    public void add() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int input = Integer.valueOf(scan.nextLine());
            
            if(input == -1) {
                break;
            } else if(input < 0 || input > 100) {
                continue;
            } else {
                gradeList.add(input);
            }
        }
    }

    public double pointAverage() {
        
        // calculate the sum of points
        int sum = 0;
        for(Integer element: gradeList) {
            sum += element;
        }

        // calculate and return the average
        return 1.0 * sum / gradeList.size();

    }

    public double pointAveragePassing() {

        // calculate the sum of points
        int sum = 0;
        int count = 0;

        for(Integer element: gradeList) {
            if(element >= 50) {
                sum += element;
                count++;
            }
        }

        // if there is no passing grade, return -1
        if(count == 0) {
            return -1;
        }

        // calculate and return the average
        return (1.0 * sum / count);
    }

    public double passPercentage() {

        int countPassing = 0;

        for(int element: gradeList) {
            if(element >= 50) {
                countPassing++;
            }
        }

        return 100.0 * countPassing / gradeList.size();
    }

    public void gradeDistribution() {
        
        // storing the counts for each grade
        int[] gradeCount = new int[6];

        // convert points to grades and store them into the array
        for(int element: gradeList) {
            
            // special case for 100 points
            if(element == 100) {
                gradeCount[5]++;
            } else if(element / 10 - 4 >= 1) { // for (point / 10 - 4) >= 1
                gradeCount[element / 10 - 4]++;
            } else { // for non-passing grades
                gradeCount[0]++;
            }
            
        }

        // visualize the distribution by stars
        System.out.println("Grade distribution:");

        for(int i = gradeCount.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for(int j = 0; j < gradeCount[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}