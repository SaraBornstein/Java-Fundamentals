package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

/*
BlackjackController.java (this will contain the main())
1) In the BlackJackController, create a method named playBlackJack(). This method will interact with the user by printing
out questions and using a Scanner to get answers. First, create two Player objects. One should have the name of the user
(that they enter through the console) and the other will be the computer player.

2) After you have created both players, deal them each two cards from the deck. These cards should be added to the
players "hand" objects. Print the two cards the user received and their current hand value to the console and ask them
if they want another card. If they say "yes" to another card, deal them another card and print out all their cards and
their hand value again. Then call the computerAi method to determine whether or not the computer wants another card.
Print out whether the computer took another card or not. Repeat this process (asking for another card and dealing0 doing
this until both the user and the computer say "no" to another card, or until both players hand value is over 21.

3) When both players say "no" to another card (or when both players have "busted" (gone over 21)) print out both the users
hand and hand value as well as the computers hand and hand value and indicate who won, or whether you both lost.
 */
public class BlackjackController {

    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController(); //call non-static method from static method
        controller.playBlackJack();
    }

    public void playBlackJack(){
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.println("Please enter player name: ");

        // assign input to variable
        Player userPlayer = new Player(scanner.next()); //Take in user input and use to create player object

        //Create two Player objects. One should have the name of the user (that they enter through the console) and the other will be the computer player.
        Player computerPlayer = new Player("computer");

        Deck deck = new Deck();

        deck.deal(computerPlayer); //deals a card
        deck.deal(userPlayer);

        deck.deal(computerPlayer);
        deck.deal(userPlayer);
        System.out.println("Player hand: " + userPlayer.getHand().getHandValue());
        System.out.println("Your cards are: " + userPlayer.getHand().toString());
        System.out.println("Computer hand: " + computerPlayer.getHand().getHandValue());
    }
}
