
public class Card { //a)
	
	public static final int OROS = 1;
	public static final int COPAS = 2;
	public static final int ESPADAS = 3;
	public static final int BASTOS = 4;
	
	private int number;
	private int suit;
	
	public Card (int number, int suit) {
		this.number = number;
		this.suit = suit;
	}
	public int getNumber() {
		return number;
	}

	public int getSuit() {
		return suit;
	}

	@Override //b)
	public String toString() {
		String s = "";
		if (number < 10) {
			s = s + number;
		} else {
			if ( number == 10) {
				s = "SOTA";
			} else {
				if ( number == 11) {
					s = "CABALLO";
				} else {
					s = "REY";
				}
			}
		}
		
		switch (suit) {
			case OROS: s += " de OROS";
				break;
			case COPAS: s += " de COPAS"; 
				break;
			case BASTOS: s += " de BASTOS";
				break;
			case ESPADAS: s += " de BASTOS";		
		}
		return s;
	}
}
