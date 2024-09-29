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
 * Responsibilities of class: A PickupTruck is a subclass of Vehicle. PickupTruck IS-A Vehicle but keeps track of the amount of cargo space it can store. 
 * 
 */

public class PickupTruck extends Vehicle // PickupTruck IS-A Vehicle
{
	// Initialize int variable for the amount of cargo that the PickupTruck can hold
	private int cargoCapacity; // Vehicle HAS-A Cargo Capacity
	
	// Getter method for the amount of cargo space on the PickupTruck
	public int getCargoCapacity()
	{
		System.out.println("Cargo Capacity : " + cargoCapacity);
		return cargoCapacity;
	}
	
	// Constructor for a PickupTruck. Uses the super keyword to call the Vehicle superclass when making an object
	public PickupTruck(String manufactuerName, int vehicleMiles, int vehiclePrice, int vehicleSeats, Option[] vehicleOptions, int truckCargoCapacity)
	{
		super( manufactuerName,  vehicleMiles,  vehiclePrice,  vehicleSeats, vehicleOptions);
		
		// Sets the amount of the cargo space equal to the parameter value in the PickupTruck constructor
		cargoCapacity = truckCargoCapacity;
	}
}
