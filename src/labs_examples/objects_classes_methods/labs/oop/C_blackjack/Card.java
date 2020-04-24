package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/*
    Card.java (POJO - this will hold card data)
        char[] suit = new char[]{'♠', '♦', '♥', '♣'};
        int cardValue;
 */
public class Card {
    private char suit;
    private int cardValue;

    //constructor
    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    //getter and setter
    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        if(cardValue == 1){
            return 11;
        } else if(cardValue > 1 && cardValue < 10){
            return cardValue;
        } else {
            return 10;
        }
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
