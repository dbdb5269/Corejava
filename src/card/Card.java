package card;

import java.util.List;
import java.util.ArrayList;

public class Card {
	private Rank rank;

	private Suit suit;

	private static List<Card> deck = new ArrayList<Card>();

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	static {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	static {
		System.out.println("staitc test");
	}
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public static List<Card> getDeck() {
		return deck;
	}

	public String toString() {
		return rank + " of " + suit;
	}
}
