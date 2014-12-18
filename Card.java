
public class Card {

	
	// Instance Variables
	public String suit;
	public String rank;
	
	
	// Default Constructor
	public Card() {
		this.suit = "Empty";
		this.rank = "Empty";
	}
	
	// Parameter Constructor
	public Card(String aSuit, String aRank) {
		this.suit = aSuit;
		this.rank = aRank;
	}
	
	// Methods
	public String getSuit() {
		return this.suit;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	// toString will be used to override default to string to display cards in text
	// form to console in a visually appealing way
	public String toString() {
		String returnString = "";
		
		return returnString += this.rank + " of " + this.suit;
	}
	
	
}
