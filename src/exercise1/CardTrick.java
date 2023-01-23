package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * modifier Sarah Alexander
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        Card userCard = new Card();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[rand.nextInt(3)]);
        }

        System.out.println("What is the value of your card? Aces are 1, Jacks are 11, Queens are 12, and Kings are 13.");
        int valueInput = input.nextInt();
        userCard.setValue(valueInput);
        
        System.out.println("What is the suit of your card?");
        String suitInput = input.next();
        userCard.setSuit(suitInput);
        // and search the hand here. 
        boolean match = false;
        int handValue;
        String handSuit;
        for (int count = 0; count < hand.length; count++){
            handValue = hand[count].getValue();
            handSuit = hand[count].getSuit();
            if (valueInput == handValue && suitInput.equals(handSuit)){
                match = true;
            }
        }
        if (match){
            printInfo();
        }
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        //I'm Done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sarah Alexander.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get a job in computer programming.");
        System.out.println("-- Graduate collage on the first try.");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Drawing");
        System.out.println("-- Coding");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing Video Games");

        System.out.println();
        
    
    }

}
