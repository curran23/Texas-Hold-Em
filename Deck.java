

/**
 * @author CurranLipsett
 * @date 8/15/2014
 * @version 1.0
 * 
 * This class will be a playing card deck that is made up of 52 cards, broken up into
 * four suits containing 13 differently ranked cards. There are no jokers in this deck.
 * 
 * 
 */






import java.util.*;

public class Deck {

	// Instance Variables
	public ArrayList<Card> myDeck = new ArrayList<Card>();
	// Initialize all the suits
	protected ArrayList<Card> tableCards = new ArrayList<Card>();
	public String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	// Initialize all the ranks
	public String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private int deckSize = 0;
	
	// Default Constructor
	public Deck() {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				Card myCard = new Card(suits[i], ranks[j]);
				myDeck.add(myCard);
				deckSize ++;
			}
		}
	}
	
	// Methods
	public String toString() {
		String returnString = "";
		
		for (int i = 0; i < myDeck.size(); i++) {
			Card deckCard = myDeck.get(i);
			returnString += deckCard.toString() + "\n";
		}
		return returnString;
	}
	
	public int getSize() {
		return deckSize;
	}
	
	public Card get(int index) {
		return myDeck.get(index);
	}
	
	public ArrayList<Card> dealHoldEmToPlayer() {
		
		ArrayList<Card> playerHand = new ArrayList<Card>();
		Random randomNumber = new Random();
		int myRandomNumber1 = randomNumber.nextInt(myDeck.size());
		playerHand.add(myDeck.get(myRandomNumber1));
		myDeck.remove(myRandomNumber1);
		int myRandomNumber2 = randomNumber.nextInt(myDeck.size());
		playerHand.add(myDeck.get(myRandomNumber2));
		myDeck.remove(myRandomNumber2);
		deckSize -= 2;
		
		return playerHand;	
		
	}
	
	
	// Utilize only one arrayList to hold the flop, turn, and river
	public ArrayList<Card> dealTheFlop() {
		Random randomNumberForFlop = new Random();
		int randomFlop1 = 0, randomFlop2 = 0, randomFlop3 = 0;
		randomFlop1 = randomNumberForFlop.nextInt(myDeck.size());
		randomFlop2 = randomNumberForFlop.nextInt(myDeck.size());
		randomFlop3 = randomNumberForFlop.nextInt(myDeck.size());
		
		tableCards.add(myDeck.get(randomFlop1));
		myDeck.remove(randomFlop1);
		tableCards.add(myDeck.get(randomFlop2));
		myDeck.remove(randomFlop2);
		tableCards.add(myDeck.get(randomFlop3));
		myDeck.remove(randomFlop3);
		deckSize -= 3;
		
		return tableCards;
		
	}
	
	public ArrayList<Card> dealTheTurn() {
	
		Random randomNumberForTurn = new Random();
		int randomTurn = randomNumberForTurn.nextInt(myDeck.size());
		tableCards.add(myDeck.get(randomTurn));
		deckSize -= 1;
		return tableCards;
	}
	
	public ArrayList<Card> dealTheRiver() {
	
		Random randomNumberForRiver = new Random();
		int randomRiver = randomNumberForRiver.nextInt(myDeck.size());
		tableCards.add(myDeck.get(randomRiver));
		deckSize -= 1;
		return tableCards;
	}
	
	
}
