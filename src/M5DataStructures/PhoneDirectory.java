package M5DataStructures;
/**
 * @author Joseph Rathbun
 * 
 * * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Hashtable.html
 * 
 * Version / Date : 09/23/2024
 * 
 * Responsibilities of Class: Uses a Hashtable to add people and their phone number to the list.
 * 							  Can find the number associated with the key (String name).
 * 							  Can remove a person from the list along with their associated number.
 * 
 */
import java.util.Hashtable;

public class PhoneDirectory
{
	// Initialize a hashtable to be called in the default constructor
	private Hashtable<String, Integer> phoneList;
	
	// Method for adding a new person with a number to the hashtable
	public void setNumberForPerson(String personsName, int personsNumber )
	{
		// Add a Key of type String and Value of type Integer to the hashtable
		// Uses the parameter values respectively.
		this.phoneList.put(personsName, personsNumber);
		
		System.out.println("New Phone Data: " + personsName  + " " + phoneList.get(personsName));
	}
	
	// Method for returning the Phone Number of the desired person in the hashtable
	public Integer findNumberForPerson(String personsName)
	{
		// Create a new Integer and set it equal to the value found at the key using the parameter as a means of choosing
		Integer phoneNumber = phoneList.get(personsName);
		
		System.out.println(personsName +"'s"+" Phone Number: " + phoneNumber);
		
		return phoneNumber;
	}
	
	// Method that removes the desired person's name and number out of the hashtable
	public void forget(String personsName)
	{
		phoneList.remove(personsName);
	}
	
	// Default Constructor that sets the phoneList hashtable to a new blank one.
	public PhoneDirectory()
	{
		phoneList = new Hashtable<>();
	}
}
