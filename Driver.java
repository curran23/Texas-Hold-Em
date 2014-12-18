import java.util.*;

import javax.swing.JFrame;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Card myCard = new Card("Hearts", "Ten");
		ArrayList<Card> table = new ArrayList<Card>();
		ArrayList<Card> playerHand1, playerHand2, playerHand3, playerHand4
		, playerHand5, playerHand6 = new ArrayList<Card>();
		Random myRandom = new Random();
		Deck myDeck = new Deck();
		int randomInt = myRandom.nextInt(myDeck.getSize());
		Card myCard = new Card();
		playerHand1 = myDeck.dealHoldEmToPlayer();
		String[] cardRanks = new String[2];
		HandEvaluator myEvaluator = new HandEvaluator();
		Viewer myViewer = new Viewer();
		CardComponent myCardComponent = new CardComponent();
//		playerHand2 = myDeck.dealHoldEmToPlayer();
//		playerHand3 = myDeck.dealHoldEmToPlayer();
//		playerHand4 = myDeck.dealHoldEmToPlayer();
//		playerHand5 = myDeck.dealHoldEmToPlayer();
//		playerHand6 = myDeck.dealHoldEmToPlayer();
//		myCard = myDeck.get(randomInt);
//		table = myDeck.dealTheFlop();
//		table = myDeck.dealTheTurn();
//		table = myDeck.dealTheRiver();
//		System.out.println(table.toString());
//		System.out.println(playerHand1.toString());
//		System.out.println(playerHand2.toString());
//		System.out.println(playerHand3.toString());
//		System.out.println(playerHand4.toString());
//		System.out.println(playerHand5.toString());
//		System.out.println(playerHand6.toString());
//		System.out.println(myEvaluator.isPair(playerHand1, table));
//		System.out.println(myEvaluator.isThreeOfAKind(playerHand1, table));
		myViewer.add(myCardComponent);
		myViewer.setVisible(true);
		myViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
