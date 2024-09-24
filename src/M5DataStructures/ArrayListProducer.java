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
 * Responsibilities of class: Constructor creates an Array List. Has a method for adding String elements at desired Integer index
 * 
 */
import java.util.ArrayList;

public class ArrayListProducer
{
	// Initialize an ArrayList for Strings to be used as a base for the constructor
	private ArrayList<String> prodList; // ArrayListProducer HAS-AN ArrayList

	// Method for adding a String element to the index determined by the parameter i
	public void produce(int i, String string)
	{
		// Add the element at the desired index
		this.prodList.add(i, string);
		
		// Print list with added element
		System.out.println("Current Array List: " + this.prodList);	
	}
	
	// Constructor for the ArrayListProducer class, creates a new ArrayList and sets it equal to the parameter ArrayList
	public ArrayListProducer(ArrayList<String> list)
	{
		this.prodList = list;
	}
}
