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
2) After you have created both players, deal them each two cards from the deck. These cards should be added to the
players "hand" objects. Print the two cards the user received and their current hand value to the console and ask them
if they want another card. If they say "yes" to another card, deal them another card and print out all their cards and
their hand value again. Then call the computerAi method to determine whether or not the computer wants another card.
Print out whether the computer took another card or not. Repeat this process (asking for another card and dealing doing
this until both the user and the computer say "no" to another card, or until both players hand value is over 21.

3) When both players say "no" to another card (or when both players have "busted" (gone over 21)) print out both the users
hand and hand value as well as the computers hand and hand value and indicate who won, or whether you both lost.

B_polymorphism Exercise_04:
Add a way for the user and the computer to bet. Give the user and computer
both an initial sum of "money" and let them play with it. Take actual bets.
The player should be allowed to bet after they get dealt the first two cards, then again after getting dealt each subsequent card
-if they win, double their bet value and add it to their pot
-if they lose, deduct that amount from their pot
-make sure they don’t bet more than they have. If either user runs out of money, stop the game.
Consistently print out the current amount of money both the user and computer have after each game.

static_nonstatic Exercise_02:
Create a system that will track the total number of BlackJack games that have been played. As well as a
system to track how many games have been won by the computer, and how many have been won by the player.
 */
        Scanner scanner = new Scanner(System.in); // create scanner

        System.out.print("Please enter player name: "); // prompt user for player name input

        Player userPlayer = new Player(scanner.next()); //Take in user input and use to create user player object
        Player computerPlayer = new Player("computer"); //Create computer player object

        Deck deck = new Deck(); //create deck object

        //win counters
        int userWin = 0;
        int computerWin = 0;
        int totalGamesPlayed = 0;

        boolean play =  true;
        
        //Start each player with $10
        userPlayer.setPotValue(10);
        computerPlayer.setPotValue(10);

        while(play) {

        deck.deal(computerPlayer); //deals a card to the computer player
        deck.deal(userPlayer); //deals a card to the user player

        deck.deal(computerPlayer); //deals a 2nd card to the player
        deck.deal(userPlayer); //deals a 2nd card to the player

        System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString() + ", your starting pot value is $" + userPlayer.getPotValue());
        System.out.print(userPlayer.getName() + ", enter your bet: ");
        int userBet = scanner.nextInt();

        System.out.println("The Computer's hand value is " + computerPlayer.getHand().getHandValue() + " and starting pot value is $" + computerPlayer.getPotValue());
        System.out.print("Computer, enter your bet: ");
        int computerBet = scanner.nextInt();

        while (userPlayer.getHand().greaterThan21() == false && computerPlayer.getHand().greaterThan21() == false) {

            //ask user player if they want another card
            System.out.print(userPlayer.getName() + ", would you like another card? (y/n): ");
            boolean userHitMe = scanner.next().equals("y");
            if(userHitMe) {
                deck.deal(userPlayer); //deal next card
                System.out.print(userPlayer.getName() + ", " + userPlayer.getHand().toString());

                if(userPlayer.getHand().getScore() > 21){
                    System.out.println(" You busted. Your hand value is over 21.");
                    break;
                } else if (userPlayer.getHand().getScore() == 21){
                    break;
                } else{
                    System.out.print(" Please place your next bet: ");
                    userBet = scanner.nextInt() + userBet;
                }
            }else{
                System.out.println(userPlayer.getName() + ", " + userPlayer.getHand().toString());
            }

            //ask computerPlayer if they want another card
            System.out.print(computerPlayer.getName() + ", would you like another card? (y/n): ");
            boolean computerHitMe = scanner.next().equals("y");
            if(computerHitMe) {
                deck.deal(computerPlayer);
                System.out.println("Computer, " + computerPlayer.getHand().toString());


                if(computerPlayer.getHand().getHandValue() > 21) {
                    System.out.println("The computer busted. It's hand value is over 21.");
                    break;
                } else if(computerPlayer.getHand().getHandValue() == 21){
                    break;
                } else {
                    System.out.print("Please place your next bet: ");
                    computerBet = scanner.nextInt() + computerBet;
                }
            }else{
                System.out.println("Computer, " + computerPlayer.getHand().toString());
            }
            if(!userHitMe && !computerHitMe)
                break;
        }

        if(computerPlayer.getHand().getHandValue() < userPlayer.getHand().getScore() && userPlayer.getHand().getScore() <= 21 || computerPlayer.getHand().getHandValue() > 21){
            userPlayer.setPotValue(userPlayer.getPotValue() + userBet);
            computerPlayer.setPotValue(computerPlayer.getPotValue() - computerBet);
            System.out.println(userPlayer.getName() + ", you win! Your pot value is $" + userPlayer.getPotValue());
            userWin++;
            totalGamesPlayed++;
        } else if(computerPlayer.getHand().getHandValue() == 21 && userPlayer.getHand().getScore() == 21){
            System.out.println("You tied!");
            userPlayer.setPotValue(userPlayer.getPotValue() + userBet);
            computerPlayer.setPotValue(computerPlayer.getPotValue() + computerBet);
            System.out.println(userPlayer.getName() + ", your pot value is $" + userPlayer.getPotValue());
            System.out.println("The computer's pot vlaue is $" + computerPlayer.getPotValue());
            totalGamesPlayed++;
        }else{
            System.out.println("You lose to the computer.");
            userPlayer.setPotValue(userPlayer.getPotValue() - userBet);
            computerPlayer.setPotValue(computerPlayer.getPotValue() + computerBet);
            computerWin++;
            totalGamesPlayed++;
        }

        System.out.println(userPlayer.getName() + ", your pot value is $" + userPlayer.getPotValue());
        System.out.println("The computer's pot vlaue is $" + computerPlayer.getPotValue());
        if(userPlayer.getPotValue() <= 0 || computerPlayer.getPotValue() <=0){
            System.out.println("GAME OVER");
            return;
        }

        System.out.print("Would you like to play again? (y/n)");
        userPlayer.getHand().getCards().clear();
        computerPlayer.getHand().getCards().clear();
        if(scanner.next().equals("y")) {
            play = true;
        }else{
            play = false;
            System.out.println("Goodbye");
            System.out.println("Out of " + totalGamesPlayed + " total games, you have won " + userWin + " and the computer has won " + computerWin + ".");
        }
    }
    }
}
