package M6ObjectOrientedDesign;
/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 09/24/2024
 * 
 * Responsibilities of class: A Car is a subclass of Vehicle. Car IS-A Vehicle but keeps track of the number of doors as well.
 * 
 */

public class Car extends Vehicle // Car IS-A Vehicle
{
	// Initialize int variable for the amount of doors on the Car
	private int doors; // Car Has-A Doors
	
	// Getter method for the amount of doors on the Car
	public int getNumberOfDoors()
	{
		System.out.println("Doors: " + doors);
		return doors;
	}
	
	// Constructor for a Car. Uses the super keyword to call the Vehicle superclass when making an object
	public Car(String manufactuerName, int vehicleMiles, int vehiclePrice, int vehicleSeats, Option[] vehicleOptions, int carDoors)
	{
		super(manufactuerName, vehicleMiles, vehiclePrice, vehicleSeats, vehicleOptions);
		
		// Sets the amount of the doors equal to the parameter value in the Car constructor
		this.doors = carDoors;
	}
}

