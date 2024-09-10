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
	
	// Person inner class for boat owner
	class Person
	{
		// Initialize String variable for the boat owner's name, also the captain's
		private String personName; // Person HAS-A Name
		private String personPhoneNumber; // Person HAS-A Phone Number
		private String personZipCode; // Person HAS-A Zip Code
		
		// Getter method to grab the name of the person in this inner class
		public String getName() 
		{
			return personName;
		}
		
		// Setter method to change the name of the person to the parameter value
		public void setName(String newName)
		{
			personName = newName;
		}
		
		// Constructor for Person object, passes 3 strings: Name, Phone Number, and Zip Code
		public Person(String name, String phoneNumber, String zipCode)
		{
			// Set the Initialized variables to the respective parameter passed through the constructor
			personName = name; personPhoneNumber = phoneNumber; personZipCode = zipCode;
		}
		
		// toString for the Person inner class, prints out the Name, Phone Number, and Zip Code of the person
		public String toString()
		{
			String personReport = personName + " " + personPhoneNumber + " " + personZipCode;
			System.out.println(personReport);	
			return personReport;
		}
		
	}

	// The Harbor Class - separate from the Main Boat class - an inner class
	class Harbor 
	{
		// Initialize Array for holding boats in the harbor
		private BoatJosephRathbun[] harborSpots; // Harbor HAS-A Spot
	
		// Getter method for finding the current boat at any desired spot in the harbor.
		public BoatJosephRathbun getBoatAt(int desiredSpot)
		{
			return harborSpots[desiredSpot];
		}
		
		// Setter method for placing a boat at a specific index in the Harbor's array.
		// Returns null if harbor spot is empty and sets the current spot to the boat parameter
		public BoatJosephRathbun parkBoatAt(BoatJosephRathbun boat, int desiredSpot) 
		{
			// Placeholder boat to remember what boat was parked here before
			BoatJosephRathbun tempBoat = new BoatJosephRathbun();
			
			// If the spot desired is empty then set the current spot to the parameter boat and return null
			if ( harborSpots[desiredSpot] == null )
			{
				harborSpots[desiredSpot] = boat;		
				return null;
			}
			
			// If the desired spot is not empty, then set the placeholder boat equal to the boat 
			// at the spot, then set the spot equal to the boat parameter. Return the placeholder boat
			else 
			{		
				tempBoat = harborSpots[desiredSpot]; // Placeholder boat to remember what boat was parked here before
				harborSpots[desiredSpot] = boat;
				return tempBoat;
			}	

		}
		
		// Return a copy of the current list of boats in the harbor
		public BoatJosephRathbun[] getInventory() 
		{
			// Initialize variable for length of the harbor array being inspected.
			int n = harborSpots.length;
			
			// Initialize boat array as a copy array for the harbor being searched, set the length to the same length.
			BoatJosephRathbun[] harborInventory = new BoatJosephRathbun[n];
			
			// For loop that copies the value at each element onto a copy array for the harbor
			for ( int i = 0 ; i < n ; i++)
			{
				// Set current index in copy array to the same index in the harbor array
				harborInventory[i] = harborSpots[i];
			}			
			
			// Return entire boat array as list of boats and their elements
			return harborInventory;
		}		
		
		// Constructor for harbor class with integer as a parameter to represent total parking spots
		public Harbor(int harborParkingSpots) 
		{
			// Set harborSpots variable to a new Boat array with the length set to the parameter value.
			harborSpots = new BoatJosephRathbun[harborParkingSpots];			
		}
	}
	
		// Credit Card as an inner class of boat
		class CreditCard
		{
			
			// Initialize String variables for storing the data of the credit card
			private String cardNumber; // CreditCard HAS-A Card Number
			private String expirationDate; // CreditCard HAS-AN Expiration Date
			private String securityCode; // CreditCard HAS-A CVC Code
			
			// Initialize person variable as the card holder, contains their information inside that one variable
			private Person cardHolder;
			
			// Getter method for the Card Number on the Credit Card
			public String getCardNumber()
			{
				return cardNumber;
			}
			
			// Getter method for the Expiration Date of the Credit Card
			public String getExpirationDate()
			{
				return expirationDate;
			}
			
			// Getter method for the CVC on the Credit Card
			public String getSecurityCode()
			{
				return securityCode;
			}
		
			// Constructor for credit card that passes 3 strings and a person
			public CreditCard(String number, String date, String code, Person person) 
			{
				// Set the initialized variables to the respective parameters passed through the constructor
				cardNumber = number ; expirationDate = date ; securityCode = code ; cardHolder = person ;			
			}
			
			// toString for the credit card inner class, prints the Card Number,
			// Expiration Date, CVC Code, and the Card Holder's name
			public String toString()
			{
				String cardReport = cardNumber + " " + expirationDate + " " + securityCode + " " + cardHolder.getName();
				System.out.println(cardReport);
				return cardReport;
			}
			
		}
		
		// Inner class of boat for Credit Card Charges from purchasing a boat
		class CreditCardCharge
		{
			
			// Initialize variables for the date
			private int currentYear; // CreditCardCharge HAS-A Year
			private int currentMonth; // CreditCardCharge HAS-A Month
			private int currentDay; // CreditCardCharge HAS-A Day
			
			// Initialize variables for the boat that the buyer wants
			private BoatJosephRathbun desiredBoat; // CreditCardCharge HAS-A Boat (that is being purchased)
			
			// Initialize variables for the name of the buyer
			private String currentBuyer; // CreditCardCharge HAS-A Buyer
			
			// Initialize variables for the current card being used
			private CreditCard currentCard; // CreditCardCharge HAS-A Credit Card
			
			// Constructor for the charges made with a credit card, passes 3 integers for the date,
			// a boat to be bought, the name of the buyer, and the credit card being used.
			public CreditCardCharge(int year, int month, int day, BoatJosephRathbun boat, String buyer, CreditCard card )
			{
				// Set the initialized variables to the parameters passed through the constructor
				currentYear = year ; currentMonth = month ; currentDay = day ; 
				desiredBoat = boat ; currentBuyer = buyer ; currentCard = card;
			}
			
			// toString for CreditCardCharge inner class, prints the date of purchase, the card holder's information
			// the person buying the boat, the make/name of the boat, and the price of that boat
			public String toString()
			{
				String chargeReport = currentYear + "/" + currentMonth + "/" + currentDay + " " +currentCard + " " + 
									  currentBuyer + " " +  desiredBoat.getMake() + " $" + desiredBoat.getPrice() ;
				
				System.out.println(chargeReport);
				return chargeReport;
				
			}
		}