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
 * Responsibilities of class: A SportsUtilityVehicle is a subclass of Vehicle. SportsUtilityVehicle IS-A Vehicle but keeps track
 * 							  of the maximum amount of weight that can be towed by it.
 * 
 */

public class SportsUtilityVehicle extends Vehicle // SportsUtilityVehicle IS-A Vehicle
{
	// Initialize int variable for the maximum amount of weight that the SportsUtilityVehicle can tow
	private int maxTowingWeight;
	
	// Getter method for the maximum amount of towing weight on the SportsUtilityVehicle
	public int getMaxTowingWeight()
	{
		System.out.println("SUV's Max Towing Weight : " + maxTowingWeight);
		return maxTowingWeight;
	}
	
	// Constructor for a SportsUtilityVehicle. Uses the super keyword to call the Vehicle superclass when making an object
	public SportsUtilityVehicle(String manufactuerName, int vehicleMiles, int vehiclePrice, int vehicleSeats, Option[] vehicleOptions, int suvMaxTowingWeight)
	{
		
		super(manufactuerName, vehicleMiles, vehiclePrice, vehicleSeats,vehicleOptions);
		
		// Sets the maximum amount of the towing weight equal to the parameter value in the SportsUtilityVehicle constructor
		maxTowingWeight = suvMaxTowingWeight;
	}	
}
