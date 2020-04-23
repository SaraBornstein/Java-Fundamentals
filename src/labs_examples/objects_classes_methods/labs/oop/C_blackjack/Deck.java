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
 */
public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public void populateDeck() {
        cards = new Card[52]; //create slots to hold 52 cards

        for(int i = 1; i <= 13; i++){
            cards[i] = new Card(Card.suit[0], i);
        }


    }
/*
2) Create a deal() method that will take in a Player object and "deal" that player a random card out of the deck. To get
the random card, generate a random number between 1 and 52 (inclusive). Then check the ArrayList of Integers to make sure
that random number is not in there. If it is, that means the card has already been drawn. You need to generate new random
numbers until you find a card that has not been drawn. If/when the random number has not yet been played add the card at the index
of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt.
 */
    public void deal(Player player){
    int randomNum = (int)(Math.random() * 52) + 1; //generate a random number between 1 and 52 (inclusive)

    for(int i = 0; i < usedCards.size()-1; i++){
        while(randomNum == i[usedCards]){
            randomNum = (int)(Math.random() * 52) + 1;
        }



    }

    }
}
