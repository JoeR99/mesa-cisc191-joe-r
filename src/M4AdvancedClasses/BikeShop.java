package M4AdvancedClasses;

/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 *  * Version/date: 09/16/2024
 * 
 * Responsibilities of class: Create an object that is an array of cycles. It will store an individual cycle within each index
 * 
 */

public class BikeShop
{
	// Initialize String variable for the name of the bike shop
	private String shopName;
	
	// Initialize Cycle array variable for the bike shop constructor to use as a place to store cycles
	private Cycle[] bikeArray;
	
	// Initialize integer variable for the index of the cycle array that will increment upon adding a cycle
	private int slot = 0;
	
	// Method to add cycle's to the bike shop, also increases the slot number by one to allow different cycles to be added 
	public void addToInventory(Cycle addCycle)
	{
		bikeArray[slot] = addCycle;

		slot ++;
	}
	
	// Constructor for bike shop class, creates the cycle array and sets the length to 4.
	// Set the shop name variable to the parameter value (String)
	public BikeShop(String name)
	{
		bikeArray = new Cycle[4];
		
		shopName = name;
	}
		
	// toString for BikeShop class. Prints outs each cycle added to the array for the purposes of the test
	public String toString()
	{
		
		String shopReport = "Shop Name: " + shopName + " Slot - 0 : " + bikeArray[0] + " Slot - 1 : " + bikeArray[1] + 
							" Slot - 2 : " + bikeArray[2] + " Slot - 3 : " + bikeArray[3] ;
		
		System.out.println(shopReport);
		return shopReport;
	}
}
