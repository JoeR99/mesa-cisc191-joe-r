package M4Middle;

/**
 * @author Joseph Rathbun
 * 
 * Version/Date: 09/16/2024
 * 
 */

import java.awt.Color;

public abstract class Character
{

	// Initialize String variable for the name of the Character
	// Private so that only the class with that specific objects name is stored there.
	private String name;
	
	// Initialize Integer variable for the health of the Character
	// Protected so that other subclasses in the package can access this variable
	protected int health;
	
	// Initialize Color variable for the color of the Character
	// Protected so that other subclasses in the package can access this variable
	protected Color color;
	
	// Getter method for the Character's Health to be made in subclass
	abstract int getHealth();
	
	// Setter method for the Character's Health to be made in subclass
	abstract void setHealth(int newHealth);
	
	
	// Getter method for Character's Name
	public String getName()
	{
		System.out.println("Name : " + name);
		return name;
	}
	
	public Color getColor()
	{
		System.out.println("Color : " + color);
		return color;
	}
	
	public void setColor(Color newColor)
	{
		color = newColor;
		System.out.println("New Color : " + color);
	}
	
	// Default Constructor for the Character class
	public Character()
	{
		name = null;
			
		health = 0;
		
		color = null;
	}
	
	public Character(String charName)
	{
		// Set the name of the Character to parameter value (String)
		name = charName;
	}
	
	@Override
	public String toString()
	{
		//TODO:
		
		String charReport = "Name: " + name + " Health:" + health + " Color: " + color;
		
		System.out.println(charReport);
		return charReport;
	}
}
