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
 * Responsibilities of class: Constructor creates a Stack. Has a method for adding a String to the stack
 * 
 */
import java.util.Stack;

public class StackProducer
{
	// Initialize a Stack for Strings to be used as a base for the constructor
	private Stack<String> prodList; // StackProducer HAS-A Stack

	// Method for adding a String element to the top of the stack
	public void produce(String string)
	{
	  // Add String to the stack
      this.prodList.add(string);
      
      // Print Stack with added element
      System.out.println("Current Stack : " + this.prodList);
	}

	// Constructor for the StackProducer class, creates a new Stack and sets it equal to the parameter Stack
	public StackProducer(Stack<String> list)
	{
		this.prodList = list;
	}	
}
