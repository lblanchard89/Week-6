package War;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> hand;
	int score;
	String name;
	
	Player() {
		hand = new ArrayList<Card>();
		score = 0;
	}
	
	public void describePlayer() {
		System.out.println("Name: " + name + "Score: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
	
			return hand.remove(0);
		}
		
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	
	public void incrementScore() {
		score++;
	}
	
}
