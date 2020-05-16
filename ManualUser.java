/*
 * Christian Velasquez. CS 2336.501.
 * Board Game Project - ManualUser class.
 */

/* 
 * The User class is a subclass of the Player class that gets the color of the ManualUser.
 */

public class ManualUser extends Player{
	private char playerColor;
	
	/* Constructor that calls the superclass Player(char, int) constructor */
	ManualUser(char colorName) {
		super(colorName, 2);
		playerColor = colorName;
	}
	
	/* Returns the User color */
	public char getColorName() {
		return playerColor;
	}
}