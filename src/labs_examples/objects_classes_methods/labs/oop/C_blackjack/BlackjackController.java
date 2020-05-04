package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController(); //call non-static method from static method
        controller.playBlackJack();
    }

    public void playBlackJack(){
/*
BlackjackController.java (this will contain the main())
1) In the BlackJackController, create a method named playBlackJack(). This method will interact with the user by printing
out questions and using a Scanner to get answers. First, create two Player objects. One should have the name of the user
(that they enter through the console) and the other will be the computer player.
 */
        Scanner scanner = new Scanner(System.in); // create scanner

        System.out.print("Please enter player name: "); // prompt user for player name input

        Player userPlayer = new Player(scanner.next()); //Take in user input and use to create user player object
        Player computerPlayer = new Player("computer"); //Create computer player object

/*
2) After you have created both players, deal them each two cards from the deck. These cards should be added to the
players "hand" objects. Print the two cards the user received and their current hand value to the console and ask them
if they want another card. If they say "yes" to another card, deal them another card and print out all their cards and
their hand value again. Then call the computerAi method to determine whether or not the computer wants another card.
Print out whether the computer took another card or not. Repeat this process (asking for another card and dealing doing
this until both the user and the computer say "no" to another card, or until both players hand value is over 21.

3) When both players say "no" to another card (or when both players have "busted" (gone over 21)) print out both the users
hand and hand value as well as the computers hand and hand value and indicate who won, or whether you both lost.
 */
        Deck deck = new Deck(); //create deck object

        deck.deal(computerPlayer); //deals a card to the computer player
        deck.deal(userPlayer); //deals a card to the user player

        deck.deal(computerPlayer); //deals a 2nd card to the player
        deck.deal(userPlayer); //deals a 2nd card to the player

        System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString());
        System.out.println("The Computer's hand value is: " + computerPlayer.getHand().getHandValue());

        while (userPlayer.getHand().greaterThan21() == false && computerPlayer.getHand().greaterThan21() == false) {
            System.out.print("Would you like another card? (Please print y or no): ");

            if(scanner.next().equals("y")) {
                deck.deal(userPlayer);
                System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString());
            }else{
                System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString());
                if(computerPlayer.getHand().getHandValue() < userPlayer.getHand().getScore())
                    System.out.println("You win!");
                else
                    System.out.println("You lose to the computer.");
                return;
            }
        }
            System.out.print("You busted. Would you like to play again? (y/n) ");
        if(scanner.next().equals("y")) {
            Deck deck2 = new Deck();
            deck2.deal(userPlayer);
            System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString());
        }else{
            System.out.println("Goodbye");
        }
    }
}
