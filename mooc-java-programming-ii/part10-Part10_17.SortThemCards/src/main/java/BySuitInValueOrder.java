import java.util.Comparator;

// the cards are sorted by suit(the ordinal value of the enum class Suit to be exact) first
//    , then by value if the cards have the same suit
public class BySuitInValueOrder implements Comparator<Card> {
  @Override
  public int compare(Card c1, Card c2) {
    int suitDifference = c1.getSuit().ordinal() - c2.getSuit().ordinal();
    if(suitDifference == 0) {
      return c1.getValue() - c2.getValue();
    }

    return suitDifference;
  }

}
