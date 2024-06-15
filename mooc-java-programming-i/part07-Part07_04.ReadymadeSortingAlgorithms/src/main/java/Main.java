import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array1 = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array1));
        Main.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"hello", "abc", "bye", "chicken", "bai"};
        System.out.println(Arrays.toString(array2));
        Main.sort(array2);
        System.out.println(Arrays.toString(array2));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        System.out.println(list1);
        // for(int element: list1) {
        //     System.out.println(element + " ");
        // }

        Main.sortIntegers(list1);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("abc");
        list2.add("bye");
        list2.add("chicken");
        list2.add("bai");
        System.out.println(list2);
        
        Main.sortStrings(list2);
        System.out.println(list2);
        
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}