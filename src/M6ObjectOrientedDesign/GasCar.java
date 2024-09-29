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
 * Responsibilities of class: A GasCar is a subclass of a Car. GasCar IS-A Car but with fuel. 
 * 							  This class has a getter method for fuel and can increase the amount of fuel with the addition method.
 * 
 */

public class GasCar extends Car implements Combustible // GarCar IS-A Car AND IS Combustible
{

	// Initialize int variable for the amount of fuel the GasCar has
	private int fuel; // GasCar HAS-A Fuel
	
	// Initialize int variable for the maximum amount of fuel the GasCar can have
	// Make it final so that it can't be changed
	private final int maxFuel = 50; // GasCar HAS-A Max Fuel
	


	// Getter method for grabbing the amount of fuel in the desired GasCar
	@Override
	public int getFuelLevel()
	{
		System.out.println("Fuel: " + fuel);
		return fuel;
	}

	// Method for increasing the amount of fuel by the parameter value, stops increasing at 50
	public void addFuel(int newFuel)
	{
		System.out.println("Added Fuel: " + newFuel + " | Total Fuel: " + fuel);
		fuel = Math.min(fuel + newFuel, maxFuel);
	}
	
	// Setter method that makes the fuel of the desired GasCar equal to the max amount possible
	@Override
	public void tankUp()
	{
		fuel = maxFuel;	
	}
	
	// Constructor for GasCar that was auto-generated, set the fuel to 0
	public GasCar(String manufactuerName, int vehicleMiles, int vehiclePrice,
			int vehicleSeats, Option[] vehicleOptions, int carDoors)
	{
		super(manufactuerName, vehicleMiles, vehiclePrice, vehicleSeats, vehicleOptions,
				carDoors);
		
		// Set default fuel to empty
		this.fuel = 0;
	}
}
