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
 * Responsibilities of class: An ElectricCar is a subclass of a Car. ElectricCar IS-A Car but with a battery charge. 
 * 							  This class has a getter method for battery charge and can increase the amount of battery charge with the addition method.
 * 
 */

public class ElectricCar extends Car implements Chargeable // ElectricCar IS-A Car AND IS Chargeable
{
	// Initialize int variable for the amount of battery charge the ElectricCar currently has
	private int batteryCharge; // ElectricCar HAS-A Battery Charge
	
	// Initialize int variable for the maximum amount of battery charge that the ElectricCar can have
	// Make it final so that it can't be changed
	private final int maxCharge = 100; // ElectricCar HAS-A Max Charge
	
	// Getter method for grabbing the current battery charge of the desired ElectricCar
	@Override
	public int getBatteryCharge()
	{
		return batteryCharge;
	}

	// Method for increasing the current battery charge of the desired ElectricCar by the parameter amount, stops at 100
	public void chargeUp(int addCharge)
	{
		batteryCharge = Math.min(batteryCharge + addCharge, maxCharge);
		System.out.println("Added Charge: " + addCharge + " | Current Battery Charge: " + batteryCharge);
	}
	
	// Setter method that makes the battery charge of the desired ElectricCar equal to the max amount possible
	@Override
	public void chargeUp()
	{
		batteryCharge = maxCharge;
	}
	
	// Constructor for ElectricCar that was auto-generated, set the battery charge to 0
	public ElectricCar(String manufactuerName, int vehicleMiles,
			int vehiclePrice, int vehicleSeats, Option[] vehicleOptions,
			int carDoors)
	{
		super(manufactuerName, vehicleMiles, vehiclePrice, vehicleSeats, vehicleOptions,
				carDoors);
		
		// Set default battery charge to empty
		this.batteryCharge = 0;
	}
}
