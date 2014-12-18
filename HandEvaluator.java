import java.util.*;

public class HandEvaluator {
	
	ArrayList<Card> playerHand = new ArrayList<Card>(2);
	
	public HandEvaluator() {
		
	}

	
	public String isPair(ArrayList<Card> aHand, ArrayList<Card> aTable) {
		
		String returnString = "";
		String[] cardRanks = new String[2];
		
		// Build an array with the values of the player hand
		for (int i=0; i < 2; i ++) {
			cardRanks[i] = aHand.get(i).getRank();
		}
		
		// If you have a pocket pair
		if (aHand.get(0).rank == aHand.get(1).rank) {
			returnString = "Pocket Pair";
		}
		
		
		// For all values on the table
		for (int j = 0; j < aTable.size() - 1; j++) {
			// Take that value and compare to all other values on the table
			for (int k = j+1; k < aTable.size(); k++) {
				if (aTable.get(j).rank == aTable.get(k).rank) {
					returnString += "Table Pair" + "\n";
					}
			}
		}
		
		// For both values in the card ranks array
		for (int i = 0; i < cardRanks.length; i++) {
			// Compare both values to all values on the table (looking for pairs only)
			for (int l = 0; l < aTable.size(); l++) {
				if (aTable.get(l).getRank() == cardRanks[i]) {
					returnString = "Pair";
				}
			}
		}
		
		return returnString;
	}
	
	public String isThreeOfAKind(ArrayList<Card> aHand, ArrayList<Card> aTable) {
		
		String returnString = "";
		String[] cardRanks = new String[2];
		String[] tableRanks = new String[5];
		
		
		for (int i=0; i < 2; i ++) {
			cardRanks[i] = aHand.get(i).getRank();
		}
		
		// If you have a pocket pair, make one pass through the table to see 
		// if any other cards will give you three of a kind
		if (aHand.get(0).rank == aHand.get(1).rank) {
			for (int i = 0; i < aTable.size(); i++) {
				if (aTable.get(i).rank == aHand.get(0).rank) {
					returnString = "Three of a Kind";
				}
			}
		}
		
		// If not a pocket pair, check for three of a kind
		else {	
			// Check for a pair on the board starting at the first card
			for (int j = 0; j < aTable.size() - 1; j++) {
				// Compare the first card with the cards following it, do not compare to itself
				for (int k = j+1; k < aTable.size(); k++) {
					if (aTable.get(j).rank == aTable.get(k).rank) {
						// If a pair exists, check to see if either player cards
						// create three of a kind
						
						// If the first card in the players hand makes a 3 of a kind
						if (cardRanks[0] == aTable.get(j).rank) {
							returnString = "Three of a Kind";
						}
						// If the second card in the players hand makes a 3 of a kind
						else if (cardRanks[1] == aTable.get(j).rank) {
							returnString = "Three of a Kind";
						}
						
						// The final possibility is that there is a three of a kind on the table by itself
						else {
							// Start at the 3rd card because we will know the first two match at this point
							for (int l = k+1; l < aTable.size(); l++) {
								// We can use j to compare because we know it matches i
								if (aTable.get(l).rank == aTable.get(j).rank) {
									returnString = "Three of a kind, on the table";
								}
							}
						}
					}
				}
			}
		
	
		}
		return returnString;
	}
}
