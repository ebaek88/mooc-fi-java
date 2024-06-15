
public class Main {

    public static void main(String[] args) {
        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        System.out.println(gifts.totalWeight());

        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
