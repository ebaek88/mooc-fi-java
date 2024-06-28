import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
  private List<Card> cardList;  // List for storing cards at hand

  // constructor
  public Hand() {
    cardList = new ArrayList<>();
  }

  // adds a card to the hand
  public void add(Card card) {
    cardList.add(card);
  }

  // prints the card in hand
  public void print() {
    cardList.stream().forEach(System.out::println);
  }

  // sorts the card in hand
  public void sort() {
    List<Card> temp = cardList.stream().sorted().collect(Collectors.toList());
    cardList = temp;
  }

  // comparison for the total values of the cards in hand
  public int compareTo(Hand handCompared) {
    // computing the total values of the cards in this object using stream
    int thisTotalValue = this.cardList.stream()
                                    .mapToInt(card -> {return card.getValue();})
                                    .sum();
    // computing the total values of the cards in the object being compared using stream
    int comparedTotalValue = handCompared.cardList.stream()
                                    .mapToInt(Card::getValue)
                                    .sum();

    // return the difference
    return thisTotalValue - comparedTotalValue;
  }

  // the cards are sorted by suit(the ordinal value of the enum class Suit to be exact) first
  //    , then by value if the cards have the same suit
  public void sortBySuit() {
    Collections.sort(cardList, new BySuitInValueOrder());
  }
}
