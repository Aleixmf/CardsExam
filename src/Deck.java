
public class Deck { // c)

	private Card[] cards;
	private int remainingCards;

	public Deck() {

		cards = new Card[48];
		remainingCards = 0;

		for (int suit = 1; suit <= 4; suit++) {

			for (int number = 1; number <= 12; number++) {

				cards[remainingCards] = new Card(number, suit);
				remainingCards++;
			}
		}
		remainingCards = 48;
	}
	public void shuffle() { //d)
		Card temp; //el temp es una variable temporal para intercambiar los numeros de un array con numero de otro array
		for (int i=0; i<100000; i++) {
			int random1 = (int)(Math.random() * 48);
			int random2 = (int)(Math.random() * 48);
			temp = cards[random1];
			cards[random1] = cards[random2];
			cards[random2] = temp;
		}
	}
	public Card extractCard() {//e) 
		remainingCards --;
		return cards[remainingCards];
	}
	@Override
	public String toString() {
		String s = "";
		boolean first;
		for (int suit=1; suit <=4; suit++) {
			
			first = true;
			
			for (int i=0; i <remainingCards; i++) {
				
				if (cards[i].getSuit() == suit) {
					
					if (!first) {
						s += ", ";
					} else {
						first = false;
					}
					s += cards[i];
				}
			}
			s += "\n"; 
		}
		return s;
	}
}
