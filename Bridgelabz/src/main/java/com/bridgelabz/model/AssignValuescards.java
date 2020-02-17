package com.bridgelabz.model;

public class AssignValuescards {
    public enum Rank{two,three,four,five,six,seven,eight,nine,ten,jack,queen,king,ace};
    public enum Suit{Clubs,Diamonds,Hearts,Spades};
    
    private Rank rank;
    private Suit suit;

	
	   public AssignValuescards(Rank rank, Suit suit) { this.rank = rank;
	   this.suit = suit; }
	 
	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}
	@Override
	public String toString() {
		return "AssignValues [rank=" + rank + ", suit=" + suit + "]";
	}

	

    
    
    
    
}
