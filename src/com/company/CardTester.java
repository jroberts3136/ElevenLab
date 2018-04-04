package com.company;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceSpades = new Card("Ace", "Spades", 1);
		Card aceSpades1 = new Card("Ace", "Spades", 1);
		Card somethingElse = new Card("Two", "Clubs", 102641);

		System.out.println(aceSpades.matches(aceSpades1));
		System.out.println(aceSpades.matches(somethingElse));
	}
}
