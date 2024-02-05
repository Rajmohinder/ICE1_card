/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @author rajmohinder
 * student number 991720337
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13) + 1);  // Random value between 1 and 13

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(4)]);  // Random suit index between 0 and 3
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a card suit (hearts, diamonds, clubs, spades): ");
        String userSuit = scanner.next().toLowerCase();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);



        // and search magicHand here
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
            //Then report the result here
         if (found) {
            System.out.println("Yeah! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        // add one luckcard hard code 2,clubs
        }

        System.out.println("My Lucky Card is 2 Heart")

    }
}
