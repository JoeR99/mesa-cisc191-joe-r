package M4AdvancedClasses;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
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
 * Version/date: 09/16/2024
 * 
 * Responsibilities of class:
 * A Unicycle is a Cycle but with only one wheel
 */

 // TODO: Implement and comment all IS-A (inheritance) relationships
 
public class Unicycle extends Cycle // a Unicycle IS-A Cycle
{

	// Unicycle specific attributes
	
	public Unicycle(String newMake)
	{
		super(newMake);
		
		this.numWheels = 1;
		
		// TODO Auto-generated constructor stub
	}
	// TODO: Implement and comment HAS-A relationships separately

	// Getter method that returns the number of wheels for this bike
	@Override
	int getNumberOfWheels()
	{
		// TODO Auto-generated method stub
		System.out.println("Wheels: " + numWheels);
		return numWheels;
	}

	// Getter method that returns the current color of the bike
	@Override
	Color getColor()
	{
		// TODO Auto-generated method stub
		System.out.println("Current Color: " + color);
		return color;
	}

	// Setter method that changes the color of the current bike
	@Override
	void setColor(Color newColor)
	{
		this.color = newColor;
		System.out.println("Changing Color to: " + color);
		
	}
}