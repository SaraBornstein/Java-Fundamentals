package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

/*
Hand.java (POJO - this will hold Hand data)
    ArrayList<Card> cards;
    int handValue;
 */
public class Hand {
    ArrayList<Card> cards;
    int handValue;

    /*
    3) In the Hand class create a method that will return the score of the hand. The hand is an arraylist of Card objects.
An ace is worth one, a 2 is worth two, a 3 is worth three, ... a jack is worth 10, a queen is worth 10,
a king is worth 10.
     */
    public int handScore(){
        for(card : cards){
            handValue = handValue + cardValue;
            return handValue;
        }
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
}
