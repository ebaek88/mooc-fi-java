
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // You can test the class here
    HashMap<String, String> dictionary = new HashMap<>();
    dictionary.add("안녕", "goodbye");
    dictionary.add("안녕", "hello");
    System.out.println(dictionary.get("안녕"));
    dictionary.add("김치", "kimchi");
    System.out.println(dictionary.get("김치"));
    dictionary.remove("김치");
    System.out.println(dictionary.get("김치"));
    System.out.println(dictionary.get("김밥"));
  }// main
}// class
