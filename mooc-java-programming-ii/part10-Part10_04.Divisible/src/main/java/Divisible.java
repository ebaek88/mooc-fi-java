
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        // Alternative solution : implemented functional interfaces of Predicate and used their default function or()
        Predicate<Integer> divisibleByThree = e -> e % 3 == 0;
        Predicate<Integer> divisibleByTwo = e -> e % 2 == 0;
        Predicate<Integer> divisibleByFive = e -> e % 5 == 0;
        // same as
        // ArrayList<Integer> result = numbers.stream()
        //                                 .filter(e -> e % 2 == 0 || e % 3 == 0 || e % 5 == 0)
        //                                 .collect(Collectors.toCollection(() -> new ArrayList<>()));
        ArrayList<Integer> result = numbers.stream()
                                        .filter(divisibleByTwo.or(divisibleByThree).or(divisibleByFive))
                                        .collect(Collectors.toCollection(() -> new ArrayList<>()));
        return result;
    }

}
