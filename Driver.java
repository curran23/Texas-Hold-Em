import java.util.*;

import javax.swing.JFrame;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Card> table = new ArrayList<Card>();
		ArrayList<Card> playerHand1, playerHand2, playerHand3, playerHand4
		, playerHand5, playerHand6 = new ArrayList<Card>();
		Random myRandom = new Random();
		Deck myDeck = new Deck();
		int randomInt = myRandom.nextInt(myDeck.getDeckSize());
		Card myCard = new Card();
//		playerHand1 = myDeck.dealHoldEmToPlayer();
		String[] cardRanks = new String[2];
		HandEvaluator myEvaluator = new HandEvaluator();
//		Viewer myViewer = new Viewer();
//		CardComponent myCardComponent = new CardComponent();
//		System.out.println(myDeck.toString());
//		playerHand2 = myDeck.dealHoldEmToPlayer();
//		playerHand3 = myDeck.dealHoldEmToPlayer();
//		playerHand4 = myDeck.dealHoldEmToPlayer();
//		playerHand5 = myDeck.dealHoldEmToPlayer();
//		playerHand6 = myDeck.dealHoldEmToPlayer();
//		myCard = myDeck.get(randomInt);
//		table = myDeck.dealTheFlop();
//		System.out.println("Flop: " + table.toString());
//		System.out.println("Player 1: " + playerHand1.toString());
//		System.out.println(myEvaluator.isPair(playerHand1, table));
//		System.out.println(myEvaluator.isThreeOfAKind(playerHand1, table));
//		table = myDeck.dealTheTurn();
//		System.out.println("Turn: " + table.toString());
//		System.out.println("Player 1: " + playerHand1.toString());
//		System.out.println(myEvaluator.isPair(playerHand1, table));
//		System.out.println(myEvaluator.isThreeOfAKind(playerHand1, table));
//		table = myDeck.dealTheRiver();
//		System.out.println("River: " + table.toString());
//		System.out.println("Player 1: " + playerHand1.toString());
//		System.out.println(myEvaluator.isPair(playerHand1, table));
//		System.out.println(myEvaluator.isThreeOfAKind(playerHand1, table));
//		System.out.println(playerHand2.toString());
//		System.out.println(playerHand3.toString());
//		System.out.println(playerHand4.toString());
//		System.out.println(playerHand5.toString());
//		System.out.println(playerHand6.toString());
		Card firstCard = new Card("Hearts", "Jack");
		Card secondCard = new Card("Diamonds", "Ace");
		Card thirdCard = new Card("Spades", "Two");
		Card fourthCard = new Card("Diamonds", "Two");
		Card fifthCard = new Card("Clubs", "Six");
		Card playerCard1 = new Card("Diamonds", "Ace");
		Card playerCard2 = new Card("Diamonds", "Seven");
		playerHand1 = new ArrayList<Card>();
		playerHand1.add(playerCard1);
		playerHand1.add(playerCard2);

		// Testing below
		table.add(firstCard);
		table.add(secondCard);
		table.add(thirdCard);
		table.add(fourthCard);
		table.add(fifthCard);
		System.out.println(table.toString());
		System.out.println(playerHand1.toString());
		System.out.println(myEvaluator.isTwoPair(playerHand1, table));
		
		
	}

}
