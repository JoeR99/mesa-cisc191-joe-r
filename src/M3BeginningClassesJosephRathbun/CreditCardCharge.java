package M3BeginningClassesJosephRathbun;

/**
 * @author: Joseph Rathbun
 * @Purpose: Class for boat purchases using a credit card
 * 
 * Version/date: 09/10/2024
 * 
 */

public class CreditCardCharge
{
		
		// Initialize variables for the date
		private int currentYear; // CreditCardCharge HAS-A Year
		private int currentMonth; // CreditCardCharge HAS-A Month
		private int currentDay; // CreditCardCharge HAS-A Day
		
		// Initialize variables for the boat that the buyer wants
		private Boat desiredBoat; // CreditCardCharge HAS-A Boat (that is being purchased)
		
		// Initialize variables for the name of the buyer
		private String currentBuyer; // CreditCardCharge HAS-A Buyer
		
		// Initialize variables for the current card being used
		private CreditCard currentCard; // CreditCardCharge HAS-A Credit Card
		
		// Constructor for the charges made with a credit card, passes 3 integers for the date,
		// a boat to be bought, the name of the buyer, and the credit card being used.
		public CreditCardCharge(int year, int month, int day, Boat boat, String buyer, CreditCard card )
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
