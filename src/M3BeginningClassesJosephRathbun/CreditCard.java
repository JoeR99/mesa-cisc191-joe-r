package M3BeginningClassesJosephRathbun;

/**
 * @author: Joseph Rathbun
 * @Purpose: Class for credit card purchases used on buying boats
 * 
 * Version/date: 09/10/2024
 * 
 */

public class CreditCard
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
