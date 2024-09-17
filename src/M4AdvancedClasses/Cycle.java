package M4AdvancedClasses;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Joseph Rathbun
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
 * Responsibilities of class: Create an object called Cycle. It has a few attributes; a make, a color, wheels, a frame number, and a cycle number identifier
 * 
 */
/**
 * Only change sections that are marked with TODO
 */

//TODO: Implement and comment all IS-A (inheritance) relationships

public abstract class Cycle
{
	// TODO: Implement and comment HAS-A relationships separately
	
	// A cycle has a unique frame number, that is *immutable*;
	// How are you going to make it immutable, so that it only gets one final number? 
	// (Hint: did you see the hint?)
	
	// Initialize Integer variable to keep track of the number of cycles that have been created
	// Shared between all classes
	private static int frameNumber = 0;
	
	// Initialize variable for the cycle to have a number as an identifier.
	// It will be equal to frameNumber after being increased by 1
	private int cycleNumberID;
	
	// Initialize variable for the number of wheels a cycle has
	protected int numWheels;
	
	// Initialize String variable for the name/make of the cycle
	private String make;
	
	// Initialize Color variable for the color of the current cycle
	protected Color color;
	
	// A cycle has a make, that is immutable
	// TODO:
	
	// Cycle constructor that sets make to the parameter value (String) 
	// Also set the current cycle's number identifier to the increased frameNumber
	public Cycle(String newMake)
	{
		// Set the variable make to the parameter value
		make = newMake;
		
		// Set the cycle number identifier to the increased frame number
		cycleNumberID = ++frameNumber;
		
	}
		// TODO

	abstract int getNumberOfWheels();
	
	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();
	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	
	// Getter method that returns the make of the bike (String)
	public String getMake()
	{
		// TODO
		System.out.println("Make : " + make);
		return make;
	}
	
	/**
	 * 
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	
	// Getter method that returns the frame number of the current bike.
	public int getFrameNumber()
	{
		// TODO
		System.out.println("Frame/Bike Number: " + cycleNumberID);
		return cycleNumberID;
	}
	
	/**
	 *  @return true if the frame number are the same
	 */
//	@Override
//	public boolean equals(Object other)
//	{
//		// TODO: 
//		// Hint: use instanceof
//		// See: https://www.sitepoint.com/implement-javas-equals-method-correctly/
//		return false;
//	}
	
	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString()
	{
		//TODO:
		
		String cycleReport = "Make: " + make + " Frame Number:" + cycleNumberID + " Color: " + color;
		
		System.out.println(cycleReport);
		return cycleReport;
	}
}