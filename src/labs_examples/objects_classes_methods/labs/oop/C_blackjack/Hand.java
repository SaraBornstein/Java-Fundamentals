package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

/*
Hand.java (POJO - this will hold Hand data)
    ArrayList<Card> cards;
    int handValue;
 */
public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;

    /*
    3) In the Hand class create a method that will return the score of the hand. The hand is an arraylist of Card objects.
An ace is worth one, a 2 is worth two, a 3 is worth three, ... a jack is worth 10, a queen is worth 10,
a king is worth 10.
     */
    public int getScore(){
        handValue = 0;
        for(Card c : cards){
            handValue = handValue + c.getCardValue();
        }
        return handValue;
    }
/*
4) In the Hand class, create a method that will return true if the hand value is greater than 21 and false if the hand
value is less than 21
 */
    public boolean greaterThan21(){
        if(handValue > 21)
            return true;
        else
            return false;
    }

    //getters and setters
    public ArrayList<Card> getCards() {
        return cards;
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public int getHandValue() {
        return getScore();
    }
    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        String str = "";

        for(Card c : cards){
            str = str + c.getCardValue() + c.getSuit();
        }
        return "your cards are: " + str +
                ", your hand value is " + getScore();
    }
}
