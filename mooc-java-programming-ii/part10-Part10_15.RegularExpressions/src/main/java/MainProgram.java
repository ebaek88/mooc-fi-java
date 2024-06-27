

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker test = new Checker();
        if(test.isDayOfWeek("tue")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.isDayOfWeek("abc")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.allVowels("oi")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.allVowels("queue")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.timeOfDay("17:23:05")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.timeOfDay("abc")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.timeOfDay("33:33:33")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
        System.out.println();
        if(test.timeOfDay("17:23:60")) {
          System.out.println("The form is correct.");
        } else {
          System.out.println("The form is incorrect.");
        }
    }
}
