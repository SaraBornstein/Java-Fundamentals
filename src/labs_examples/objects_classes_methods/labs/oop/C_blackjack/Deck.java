package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import com.sun.xml.internal.bind.v2.TODO;
import java.util.ArrayList;

/*
Deck.java (POJO - this will hold deck data)
    Card[] cards;
    ArrayList<Integer> usedCards;
1) Create a method that will populate the Card[] with 52 unique Card object. The cards
should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
(spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings

 2) Create a deal() method that will take in a Player object and "deal" that player a random card out of the deck. To get
the random card, generate a random number between 1 and 52 (inclusive). Then check the ArrayList of Integers to make sure
that random number is not in there. If it is, that means the card has already been drawn. You need to generate new random
numbers until you find a card that has not been drawn. If/when the random number has not yet been played add the card at the index
of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt.
 */
public class Deck {

    //instance variables
    Card[] cards = new Card[52]; //array of 52 Card types
    ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    //constructor
    public Deck() {
        populateDeck();
    }

    public void populateDeck() { //return type: array?

        int count = 0;

        for(int i = 0; i < 13; i++){
            for(int y = 0; y < 4; y++){
                Card obj = new Card(suits[y], i+1);
                cards[count] = obj;
                count++;
            }
        }
    }
    /*
    If/when the random number has not yet been played add the card at the index
of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt.
     */
    //Deal method
    public void deal(Player player){
        int randomNum = (int)(Math.random() * 52); //generate a random number between 0 and 52 (inclusive)

        if(usedCards.contains(randomNum)){
            do{
                randomNum = (int)(Math.random() * 52);
            } while (usedCards.contains(randomNum));
        }

        usedCards.add(randomNum);

        //player.hand.cards.add(cards[randomNum]); //object composition
        player.getHand().getCards().add(cards[randomNum]);
        /*
        When you make all variables in player and hand classes private, use getters and setters
        player.getHand().getCards().add(cards[randomNum])
         */
    }
}
