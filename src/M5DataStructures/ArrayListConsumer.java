package M5DataStructures;
/**
 * Lead Author(s):
 * 
 * @author Joseph Rathbun
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date: 09/21/2024
 * 
 * Responsibilities of class: Constructor creates an Array List. Has a method for removing String elements at the first index, returns null if the list is empty
 * 
 */
import java.util.ArrayList;

public class ArrayListConsumer
{
	// Initialize an ArrayList for Strings to be used as a base for the constructor
	private ArrayList<String> consList; // ArrayListConsumer HAS-AN ArrayList

	// Method for removing the first element of the ArrayList, returns null if the list is empty.
	public String consume()
	{
		// If list is empty, then return null
		if ( this.consList.isEmpty() )
		{
			System.out.println("Nothing in the Array List: " + this.consList);
			return null;
		}
		
		// Create String as placeholder for element being removed, gets returned at the end
		String temp = this.consList.getFirst();
		
		// Remove the first element
		this.consList.remove(0);
		
		// Print list without the removed element
		System.out.println("Current Array List: " + this.consList);
		
		// Return placeholder
		return temp;
	}
	
	// Constructor for the ArrayListConsumer class, creates a new ArrayList and sets it equal to the parameter ArrayList
	public ArrayListConsumer(ArrayList<String> list)
	{
		this.consList = list;
		System.out.println("Array List: " + this.consList);
	}
}
