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
 * Responsibilities of class: Constructor creates a Linked List. Has a method for removing the element at the first index, returns null if the list is empty
 * 							  Another method for removing the last element in the list, returns null if the list is empty.
 * 
 */
import java.util.LinkedList;

public class LinkedListConsumer
{
	// Initialize a LinkedList for Strings to be used as a base for the constructor
	private LinkedList<String> consList; // LinkedListConsumer HAS-A LinkedList
	
	// Method for removing the first element of the LinkedList, returns null if the list is empty
	public String consumeHead()
	{
		// If list is empty, then return null
		if ( this.consList.isEmpty() )
		{
			System.out.println("Nothing in the Linked List: " + this.consList);
			return null;
		}	
		
		// Create String as placeholder for element being removed, gets returned at the end
		String tempFirst = this.consList.getFirst();
		
		// Remove the first element
		this.consList.removeFirst();
		
		// Print list without the removed element
		System.out.println("Current Linked List: " + this.consList);	
		
		// Return placeholder
		return tempFirst;
	}

	// Method for removing the last element of the LinkedList, returns null if the list is empty
	public String consumeTail()
	{
		// If list is empty, then return null
		if ( this.consList.isEmpty() )
		{
			System.out.println("Nothing in the Linked List: " + this.consList);
			return null;
		}
		
		// Create String as placeholder for element being removed, gets returned at the end
		String tempLast = this.consList.getLast();
		
		// Remove the last element
		this.consList.removeLast();
		
		// Print list without the removed element
		System.out.println("Current Linked List: " + this.consList);
		
		// Return placeholder
		return tempLast;
	}
	
	// Constructor for the LinkedListConsumer class, creates a new LinkedList and sets it equal to the parameter LinkedList
	public LinkedListConsumer(LinkedList<String> list)
	{
		this.consList = list;
	}
}
