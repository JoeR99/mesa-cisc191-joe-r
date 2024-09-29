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
 * Responsibilities of class: Creates an object called Vehicle. It has a few variables: name, miles, price, seats, and options.
 * 							  Getter methods for these variables are stored here.
 * 
 */

// TODO: Implement and comment all IS-A and IS relationships separately

public class Vehicle
{
	// TODO: Implement and comment all HAS-A relationships separately

	// TODO Implement a constructor

	// TODO Implement all the methods from the UML

	// Initialize String variable for the manufacturer of the Vehicle
	private String name; // Vehicle HAS-A Name
	
	// Initialize int variable for the amount of miles on the Vehicle
	private int miles; // Vehicle HAS-A Mile
	
	// Initialize int variable for the price of the Vehicle
	private int price; // Vehicle HAS-A Price
	
	// Initialize int variable for the amount of seats on the Vehicle
	private int seats; // Vehicle HAS-A Seats
	
	// Initialize Options array variable for the price of the Vehicle
	private Option[] options; // Vehicle HAS-MANY Options
	
	// Getter method for grabbing the manufacturer of the desired vehicle
	public String getManufacturerName()
	{
		System.out.println("Manufacturer: " + name);
		return name;
	}
	
	// Getter method for grabbing the miles driven of the desired vehicle
	public int getMilesOnVehicle()
	{
		System.out.println("Miles: " + miles);
		return miles;
	}
	
	// Getter method for grabbing the price of the desired vehicle
	public int getPrice()
	{
		System.out.println("Price: " + price);
		return price;
	}
	
	// Getter method for grabbing the number of seats of the desired vehicle
	public int getNumberOfSeats()
	{
		System.out.println("Seats: " + seats);
		return seats;
	}
	
	// Getter method for grabbing the amount of options of the desired vehicle
	public Option[] getOptions()
	{
		System.out.println("Options: " + options);
		return options;
	}
	
	// Main Constructor for Vehicle that sets the name, miles, price, seats, and options of the desired Vehicle
	public Vehicle(String manufactuerName, int vehicleMiles, int vehiclePrice, int vehicleSeats, Option[] vehicleOptions)
	{
		// Set name to the parameter String manufactuerName
		name = manufactuerName;
		
		// Set miles to the parameter int vehicleMiles
		miles = vehicleMiles;
		
		// Set price of the vehicle to the parameter int vehiclePrice
		price = vehiclePrice;
		
		// Set number of seats to the parameter int vehicleSeats
		seats = vehicleSeats;
		
		// Set options to the parameter
		options = vehicleOptions;
		
		System.out.println("Manufacturer: " + name + " | Miles: " + miles + " | Price: " + price + " | Seats: " + seats);
	}
}
