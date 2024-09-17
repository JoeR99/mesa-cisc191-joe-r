package M3BeginningClassesJosephRathbun;

/**
 * @author: Joseph Rathbun
 * @Purpose: Class for making a person object for the boat class
 * 
 * Version/date: 09/10/2024
 * 
 */

public class Person
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
