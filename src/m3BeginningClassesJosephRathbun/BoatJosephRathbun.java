package m3BeginningClassesJosephRathbun;

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
 * Version/date: 09/09/2024
 * 
 * Responsibilities of class:
 * Create a boat with a make, color, speed, and price as variables.
 * Mutators for the variables and Constructors to make a boat with certain parameters.
 * 
 */

//TODO: implement and remove all TODOs

/**
 */
public class BoatJosephRathbun
{
	// TODO: Implement and comment all HAS-A relationships separately
	// For instance: A boat has a make
	
	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	
	
	// Initialize variables for Boat methods and constructors, make sure they are private
	public String make; // Boat HAS-A make
	private Color color; // Boat HAS-A Color
	private int speed; // Boat HAS-A Speed
	private int price; // Boat HAS-A Price
	
	// Initialize variable for Serial Numbers as integers
	private int boatSerialNumber; // Boat HAS-A Serial Number
	
	// Initialize variables for a Person who owns the boat and a Captain for that boat, both have 3 strings attached to it.
	private Person boatOwner; // Boat HAS-AN Owner
	private Person boatCaptain; // Boat HAS-A Captain
	
	// This variable has static to retain its values across any call to createNewSerialNumber()
	private static int currentSerialNumber; // Serial Number increases upon making new boat	
	
	// Getter method for grabbing the current Make of the Boat
	public String getMake()
	{
		// TODO
		return make;
	}
	
	// Setter method for changing the Make of the Boat
	public void setMake(String newMake) 
	{
		make = newMake;
	}

	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */	
	
	// Getter method for grabbing the current Color of the Boat
	public Color getColor()
	{
		// TODO
		return color;
	}

	// Setter method for changing the Color of the Boat
	public void setColor(Color newColor)
	{
		color = newColor;
	}
	
	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	
	// Getter method for grabbing the current Speed of the Boat
	public int getSpeed()
	{
		// TODO
		return speed;
	}
	
	// Setter method for changing the Speed of the Boat
	public void setSpeed(int newSpeed)
	{
		speed =  newSpeed;
	}

	// Method for increasing the value of a Boat's Speed
	public void speedUp()
	{
		speed++;
	}
		
	// Method for decreasing the value of a Boat's Speed, does not go below 0
	public void slowDown()
	{
		if ( speed > 0)
		speed--;
		
	}
	
	// Getter method for grabbing the current Price of the Boat
	public int getPrice() 
	{
		return price;
	}
	
	// Setter for changing the Price of the Boat
	public void setPrice(int newPrice)
	{	
		price = newPrice;
	}
	
	// Getter method for the Serial Number of the Boat
	public int getSerialNumber()
	{
		return boatSerialNumber;
	}
	
	// Method for Serial Number creation
	public static int createNewSerialNumber()
	{	
		currentSerialNumber++;  // Boat HAS-A Serial Number
			
		return currentSerialNumber;
	}
	
	// Getter method for grabbing the Person that currently owns the boat
	public Person getOwner()
	{
		return boatOwner;
	}	
	
	// Setter method for changing the current person that owns the boat
	public void setOwner(Person owner)
	{
		boatOwner = owner;
	}
	
	// Getter method for obtaining the person that is the captain of the boat
	public Person getCaptain()
	{
		return boatCaptain;
	}
	
	// Setter method for changing the person that is the captain of the boat
	public void setCaptain(Person captain)
	{
		boatCaptain = captain;
	}
	
	// The toString for the Boat class
	public String toString()
	{
		// Create String and name it report for obvious reasons, this is to make the code our own
	    String report = "Boat: make: " + make + " color: " + color;
	    
	    // Print out desired toString for debugging, because we won't see the exact errors otherwise 
	    System.out.println(report);
	    return report;
	}
	
	// This is the default Boat constructor
	public BoatJosephRathbun()
	{
		// Set the default make and color to null
		make = null;;
		color = null;
		
		// Set default speed to zero and price to -1
		speed = 0;
		price = -1;
		
		// Each time a boat is created assign a Serial Number to it 
		// Since we refer to the default in all boat constructors I only call it here
		boatSerialNumber = createNewSerialNumber();
		System.out.println("Serial Number: " + boatSerialNumber);
		
		// Set the Owner and Captain of the boat to null by default
		// Since we refer to the default in all boat constructors I only call it here
		boatOwner = null;
		boatCaptain = null;
	}
	
	// Boat Constructor for setting a make and color only
	public BoatJosephRathbun(String startMake, Color startColor) 
	{
		// Initialize the default constructor to save me from repeating variables 
		this();
		
		// Set make and color equal to parameter values, respectively
		make = startMake;
		color = startColor;		
	}
	
	// Copy Constructor for Boat, sets make, color, speed, and price to parameter boat values
	public BoatJosephRathbun(BoatJosephRathbun boat)
	{
		// Initialize the default constructor to save me from repeating variables
		this();
		
		// Get the make, color, speed, and price of any Boat
		// then set the values of the parameter-boat onto a default-boat as a copy
		make = boat.getMake();
		color = boat.getColor();
		speed = boat.getSpeed();
		price = boat.getPrice();
	}
	
}