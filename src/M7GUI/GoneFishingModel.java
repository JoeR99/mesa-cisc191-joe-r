package M7GUI;

/**
 * Lead Author(s):
 * @author Tasha Frankie
 * @author Allan Schougaard
 * 
 * Responsibilities of class:
 * 
 * Model and track the non-visual game play
 */

import java.util.Random;

// TODO: comment each method and each line of code to show you understand how it works

public class GoneFishingModel
{
	public static final int DIMENSION = 6; // The Dimensions of the grid for the fishing game
	private boolean[][] grid = new boolean[DIMENSION][DIMENSION]; // Keeps track of fish in the game, fish are true or false
	private int triesRemaining = 30; // Amount of tries left in the game
	private int fishRemaining = 10; // Amount of fish left in the game

	/**
	 * TODO
	 */
	public GoneFishingModel()
	{
		Random randomNumberGenerator = new Random(); // Random Number Generator
		
		// For Loop to set row and column to a random for placing fish at that row and column
		for (int fishCounter = 0; fishCounter < fishRemaining; fishCounter++)
		{
			int row, column;
			do // Part of the while loop that calls the following code as long as the while loop is true
			{
				row = randomNumberGenerator.nextInt(DIMENSION);
				column = randomNumberGenerator.nextInt(DIMENSION);
			} while (grid[row][column]); // While loop that sets row and column to a random number 
			grid[row][column] = true; // Set the random grid point to true
		}
	}

	/**
	 * TODO
	 * @param row
	 * @param column
	 * @return
	 */
	// Method that reduces triesRemaining by one each time it is invoked. Also reduces fishRemaining by one if the current row by column is equal to true
	public boolean fishAt(int row, int column)  
	{
		triesRemaining--; // Reduce tries upon clicking a button
		boolean foundFish = grid[row][column]; // Shallow Copy of boolean at the row and column of the grid
		if (foundFish) // Check if button at the current row and column is set to true, if it is then reduce the amount of fish remaining by one
		{
			fishRemaining--;			
		}
		return foundFish; // Returns true or false depending on current grid row and column
	}

	/**
	 * TODO
	 * @return
	 */
	public int getTriesRemaining() // Accessor for triesRemaining, used for adjusting the tries slider
	{
		return triesRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public int getFishRemaining() // Accessor for fishRemaining, used for adjusting the fish slider
	{
		return fishRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean fishWin() // Boolean that returns true once triesRemaining hits zero and there are fish still to be found
	{
		return triesRemaining == 0 && fishRemaining > 0;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean playerWins() // Boolean that returns true when there are no more fish in the game
	{
		return fishRemaining == 0;
	}
}
