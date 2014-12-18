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
			returnString = "Pair";
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
		
		// If not a pocket pair, 3 of a kind is still possible
		else {	
			// Check for a pair on the board
			for (int j = 0; j < aTable.size() - 1; j++) {
				for (int k = j+1; k < aTable.size(); k++) {
					if (aTable.get(j).rank == aTable.get(k).rank) {
						// If a pair exists, check to see if either player cards
						// create three of a kind
						if (cardRanks[0] == aTable.get(j).rank) {
							returnString = "Three of a Kind";
						}
						else if (cardRanks[1] == aTable.get(j).rank) {
							returnString = "Three of a Kind";
						}
					}
				}
			}
		
	
		}
		return returnString;
	}
}
