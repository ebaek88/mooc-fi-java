

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";  // value for a jack
        } else if (value == 12) {
            cardValue = "Q";  // value for a queen
        } else if (value == 13) {
            cardValue = "K";  // value for a king
        } else if (value == 14) {
            cardValue = "A";  // value for an ace
        }
        
        return suit + " " + cardValue;
    }

    // getters
    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    // implements the compareTo method for cards
    @Override
    public int compareTo(Card card) {
      int valueDifference = this.getValue() - card.getValue();  // first compares the values of the two cards
      if(valueDifference == 0) {  // compares suit if the cards being compared have the same value
        return this.getSuit().ordinal() - card.getSuit().ordinal();
      }
      return valueDifference;
    }//method
}//class
