package m3BeginningClassesJosephRathbun;

/**
 * @author: Joseph Rathbun
 * @Purpose: Class for storing multiple boats into an array, in this case a Harbor
 * 
 * Version/date: 09/17/2024
 * 
 */

public class Harbor
{
	
	// Initialize Array for holding boats in the harbor
	private Boat[] harborSpots; // Harbor HAS-MANY Spots
	
	// Getter method for finding the current boat at any desired spot in the harbor.
	public Boat getBoatAt(int desiredSpot)
	{
		return harborSpots[desiredSpot];
	}
		
	// Setter method for placing a boat at a specific index in the Harbor's array.
	public Boat parkBoatAt(Boat boat, int desiredSpot) 
	{
		// Placeholder boat to remember what boat was parked here before
		Boat tempBoat = new Boat();

		// Set the placeholder boat equal to the boat at the spot.
		// Then set the spot equal to the boat parameter. 
		// Return the placeholder boat
		tempBoat = harborSpots[desiredSpot]; // Set Placeholder boat to remember what boat was parked here before
		harborSpots[desiredSpot] = boat;
		return tempBoat;
	}
	
	// Return a copy of the current list of boats in the harbor
	public Boat[] getInventory() 
	{
		// Initialize variable for length of the harbor array being inspected.
		int n = harborSpots.length;
		
		// Initialize boat array as a copy array for the harbor being searched, set the length to the same length.
		Boat[] harborInventory = new Boat[n];
		
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
		harborSpots = new Boat[harborParkingSpots];			
	}
}
