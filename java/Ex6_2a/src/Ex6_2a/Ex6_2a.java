package Ex6_2a;

enum Suit{
	CLUBS("black"), DIAMONDS("red"),
	HEARTS("red"), SPACE("black");
	
	private final String color;
	
	private Suit(String SuitColor) {
		color= SuitColor;
	}
	public String getColor() {
		return color;
	}
	
}

public class Ex6_2a {
	
	
	public static void main(String[] args) {
		Suit cardSuit=Suit.SPACE;
		

		System.out.println("ordinal:"+cardSuit.ordinal());
		System.out.println("equals:"+cardSuit.equals(Suit.CLUBS));
		System.out.println("valueOf:"+Suit.valueOf("CLUBS"));
		System.out.println("getcoolot:"+cardSuit.getColor());
		System.out.println("to string:"+cardSuit.toString());
		
	}

}
