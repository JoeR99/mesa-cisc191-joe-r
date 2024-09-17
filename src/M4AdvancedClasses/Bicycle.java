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
 * A a Bicycle IS-A Cycle but with two wheels
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements) relationships separately

public class Bicycle extends Cycle // a Bicycle IS-A Cycle
{

	public Bicycle(String newMake)
	{
		super(newMake);
		
		this.numWheels = 2;
		
		// TODO Auto-generated constructor stub
	}
	// TODO: Implement and comment HAS-A relationships separately

	@Override
	int getNumberOfWheels()
	{
		// TODO Auto-generated method stub
		System.out.println("Wheels: " + numWheels);
		return numWheels;
	}

	@Override
	Color getColor()
	{
		// TODO Auto-generated method stub
		System.out.println("Current Color: " + color);
		return color;
	}

	@Override
	void setColor(Color newColor)
	{
		// TODO Auto-generated method stub
		this.color = newColor;
		System.out.println("Changing Color to: " + color);
	}
}