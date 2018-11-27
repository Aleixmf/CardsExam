
public class MainClass {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.extractCard());
		System.out.println(deck.extractCard());
	}

}
