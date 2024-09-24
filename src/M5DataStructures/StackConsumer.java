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
 * Responsibilities of class: Constructor creates a Stack. Has a method for removing String elements at the top of the stack, returns null if the stack is empty
 * 
 */
import java.util.Stack;

public class StackConsumer
{
	// Initialize a Stack for Strings to be used as a base for the constructor
	private Stack<String> consList; // StackConsumer HAS-A Stack

	// Method for removing the last element of the Stack, returns null if the list is empty.
	public String consume()
	{
		// If the stack is empty, then return null
		if ( this.consList.isEmpty() )
		{
			System.out.println("Nothing in the Stack : " + this.consList);
			return null;
		}
		
		// Create String as placeholder for element being removed, gets returned at the end
		String temp = this.consList.peek();

		// Remove the top element of the stack
		this.consList.pop();
		
		// Print list without the removed element
		System.out.println("Current Stack : " + this.consList);
		
		// Return placeholder
		return temp;
	}

	// Constructor for the StackConsumer class, creates a new Stack and sets it equal to the parameter Stack
	public StackConsumer(Stack<String> list)
	{
		this.consList = list;
		System.out.println("Stack: " + this.consList);
	}
}
