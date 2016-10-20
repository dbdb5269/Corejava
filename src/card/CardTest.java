package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardTest {

	public static void main(String[] args) {
		int hands = 4;
		int perHand = 10;
		List<Card> deck = Card.getDeck();
		System.out.println("****before shuffle deck****");
		System.out.println(deck);
		Collections.shuffle(deck);
		System.out.println("****after shuffle deck****");
		System.out.println(deck);
		System.out.println("****total cards:" + deck.size() + "****");
		// ��4���ƣ�ÿ��10��
		for (int i = 1; i <= hands; i++) {
			List<Card> hand = dealHand(deck, perHand);
			System.out.println("hand" + i + ":" + hand);
		}
	}

	private static List<Card> dealHand(List<Card> deck, int perHand) {
		int size = deck.size();
		System.out.println("****current deck size:" + deck.size() + "****");
		List<Card> handView = deck.subList(size - perHand, size);
		List<Card> hand = new ArrayList<Card>(handView);
		handView.clear();
		return hand;
	}
}
