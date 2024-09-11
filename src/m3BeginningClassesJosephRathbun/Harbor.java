package m3BeginningClassesJosephRathbun;

/**
 * @author: Joseph Rathbun
 * @Purpose: Class for storing multiple boats into an array, in this case a Harbor
 * 
 * Version/date: 09/10/2024
 * 
 */

public class Harbor
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
