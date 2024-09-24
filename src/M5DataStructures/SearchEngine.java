package M5DataStructures;
/**
 * Lead Author(s):
 * 
 * @author Joseph Rathbun
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Hashtable.html
 * 
 * Version/date: 09/23/2024
 * 
 * Responsibilities of class: Create a Hashtable that stores a Key of type String and a LinkedList of type String.
 * 							  It can add strings to the LinkedList of the specific key.
 * 							  It can search the hashtable for a specific key
 * 
 */
import java.util.Hashtable;
import java.util.LinkedList;

public class SearchEngine
{
	// Initialize a Hashtable to store a key of type String and a LinkedList of type String
	// It will serve as our base for holding multiples values for each specific key.
	private Hashtable<String, LinkedList<String>> hashData;
	
	// Method for adding A Key to the hashtable
	public void add(String keyName, String webName)
	{
		// If the key String is not in the hashtable, then add a key with the parameter for the name
		// Give the key values of a blank LinkedList to be filled in with more additions.
		if ( !hashData.containsKey(keyName) )
		{
			this.hashData.put(keyName, new LinkedList<>());
		}
		
		// Add the webName parameter to the keyName desired 
		this.hashData.get(keyName).add(webName);
		
		System.out.println("Added to Key: " + keyName + " | Data: " + webName);
	}
	
	// Method for searching a hashtable with the parameter string as the key to find the values at that key.
	// Returns a copy of the original hashtable
	public LinkedList<String> search(String keyName)
	{
		
		// Initialize a new LinkedList and set it equal to the LinkedList found in the hashtable
		// This serves as a copy of the original data, and prevents it from being cleared by any potential hackers
		LinkedList<String> copyHashData = hashData.get(keyName);
		
		// If the parameter keyName is not inside the hashtable, then return a new LinkedList with nothing inside of it.
		if ( copyHashData == null )
		{
			return new LinkedList<>();
		}
		
		// Returns the copied hashData
		return new LinkedList<>(copyHashData);
	}
	
	// Default Constructor for the SearchEngine class. Creates a blank Hashtable and sets hashData equal to it.
	public SearchEngine()
	{
		hashData = new Hashtable<>();
	}
}
