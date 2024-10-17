package M7GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 10/14/2024
 * 
 * Responsibilities of class:
 * 
 * Creates Fish Buttons with row and column data attached. 
 * Uses RNG to create ocean-like background for the buttons.
 * Sets size of the button and sets the text.
 * 
 */

@SuppressWarnings("serial")
public class FishingButton extends JButton
{

	private final int COLOR_BOUNDS_RED = 10; // Bounds the random number subtracted to my red value for the background color of the button
	
	private final int COLOR_BOUNDS_GREEN = 30; // Bounds the random number added to my green value for the background color of the button
			
	private final int COLOR_BOUNDS_BLUE = 40; // Bounds the random number added to my blue value for the background color of the button
	
	Random rng = new Random(); // Random Number Generator for the RGB Values for each button's background
	
	/**
	 * TODO
	 * @param row
	 * @param column
	 */
	
	// Initialize int fields for row and columns
	private int buttonRow;
	private int buttonColumn;
	
	// Getter method for grabbing the rows of the button
	public int getRow()
	{
		return this.buttonRow;
	}
	
	// Getter method for grabbing the columns of the button
	public int getColumn()
	{
		return this.buttonColumn;
	}	
	
	// Constructor for FishingButton, creates a button and sets its row and column
	public FishingButton(int row, int column)
	{
		this.buttonRow = row; // Set the variables for row and column of the button to the parameter values respectively
		this.buttonColumn = column;
		
		int r = 10 - rng.nextInt(COLOR_BOUNDS_RED); // Set int fields for RGB values to base values of (20,10,80), then subtract or add with the rng # respectively 
		int g = 10 + rng.nextInt(COLOR_BOUNDS_GREEN);
		int b = 90 + rng.nextInt(COLOR_BOUNDS_BLUE);
		
		this.setText("?");
		
		this.setPreferredSize(new Dimension(100,100)); // Set Size of button to WIDTH, HEIGHT
		
		this.setBackground(new Color(r,g,b)); // Set background color for current button to the values determined by the Random Number Generator
		
		this.setForeground(Color.WHITE);
		
		this.setToolTipText("Feeling Lucky?");
	
	}
}
