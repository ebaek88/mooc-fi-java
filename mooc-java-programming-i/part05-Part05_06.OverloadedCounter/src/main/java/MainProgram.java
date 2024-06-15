
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();
        
        System.out.println(counter1);
        System.out.println(counter2);

        counter1.increase(3);
        counter1.increase();
        System.out.println(counter1); // 14

        counter2.decrease(5);
        counter2.decrease();
        System.out.println(counter2); // -6
    }
}
