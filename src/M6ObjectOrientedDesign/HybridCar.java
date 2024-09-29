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
 * Responsibilities of class: A HybridCar is a subclass of a Car. HybridCar IS-A Car but with fuel and a battery charge. 
 * 							  This class has a getter method for fuel and can increase the amount of fuel to full with the tankUp method.
 * 							  This class has a getter method for battery charge and can increase the amount of battery charge to full with the chargeUp method. 
 */

public class HybridCar extends Car implements Combustible, Chargeable // HybridCar IS-A Car AND IS Combustible AND IS Chargeable
{
	// Initialize int variable for the amount of fuel the GasCar has
	private int fuel; // HybridCar HAS-A Fuel
	
	// Initialize int variable for the maximum amount of fuel the GasCar can have
	// Make it final so that it can't be changed	
	private final int maxFuel = 50; // HybridCar HAS-A Max Fuel
	
	// Initialize int variable for the amount of battery charge the ElectricCar currently has
	private int batteryCharge; // ElectricCar HAS-A Battery Charge
	
	// Initialize int variable for the maximum amount of battery charge that the ElectricCar can have
	// Make it final so that it can't be changed
	private final int maxCharge = 100; // ElectricCar HAS-A Max Charge

	// Getter method for the fuel of the desired HybridCar
	@Override
	public int getFuelLevel()
	{
		return fuel;
	}
	
	// Set the current fuel of the HybridCar to the max
	@Override
	public void tankUp()
	{
		fuel = maxFuel;
	}
	
	@Override
	public void addFuel(int newFuel)
	{
		// TODO Auto-generated method stub	
	}
	
	// Getter method for the battery charge of the desired HybridCar
	@Override
	public int getBatteryCharge()
	{
		return batteryCharge;
	}

	// Set the current battery charge of the HybridCar to the max
	@Override
	public void chargeUp()
	{
		batteryCharge = maxCharge;
	}
	
	@Override
	public void chargeUp(int addCharge)
	{
		// TODO Auto-generated method stub
	}

	// Constructor for HybridCar that was auto-generated, set the fuel and battery charge to 0
	public HybridCar(String manufactuerName, int vehicleMiles, int vehiclePrice,
			int vehicleSeats, Option[] vehicleOptions, int carDoors)
	{
		super(manufactuerName, vehicleMiles, vehiclePrice, vehicleSeats, vehicleOptions,
				carDoors);
		
		// Set the fuel and battery charge to empty
		this.fuel = 0;
		this.batteryCharge = 0;
	}
}
