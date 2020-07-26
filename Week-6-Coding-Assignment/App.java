package War;


public class App {

	public static void main(String[] args) {
		
		Deck warDeck = new Deck();
		warDeck.shuffle();
		Player joe = new Player();
		Player rick = new Player();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				joe.draw(warDeck);
			}
			else if (i % 2 != 0) {
				rick.draw(warDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card joeCard = joe.flip();
			Card rickCard = rick.flip();
			if (joeCard.getValue() > rickCard.getValue()) {
				joe.incrementScore();
			}
			else if (rickCard.getValue() > joeCard.getValue()) {
				rick.incrementScore();
			
			}
		}	
		System.out.println("Joe's Score: " + joe.score);
		System.out.println("Rick's Score: " + rick.score);
			
		 if (rick.score == joe.score) {
			 System.out.println("Looks like we have a draw");
		 }
		 else if (rick.score > joe.score) {
			 System.out.println("Rick is the winner!");
		 }
		 else if (joe.score > rick.score) {
			 System.out.println("Joe is the winner!");
		 }
				
		
	}
}	

