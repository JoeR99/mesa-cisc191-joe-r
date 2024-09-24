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
 * Responsibilities of class: Constructor creates a Linked List. Has a method for adding String elements at the first index
 * 
 */
import java.util.LinkedList;

public class LinkedListProducer
{
	// Initialize a LinkedList for Strings to be used as a base for the constructor
	private LinkedList<String> prodList; // LinkedListProducer HAS-A LinkedList

	// Method for adding a String to the LinkedList
	public void produce(String string)
	{
		// Add the String parameter to the list
		this.prodList.add(string);
		
		// Print list with added element
		System.out.println("Current Linked List: " + this.prodList);
	}
	
	// Constructor for the LinkedListProducer class, creates a new LinkedList and sets it equal to the parameter LinkedList
	public LinkedListProducer(LinkedList<String> list)
	{	
		this.prodList = list;	
	}
}
