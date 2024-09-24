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
 * Version/date: Joseph Rathbun
 * 
 * Responsibilities of class: Constructor creates a Queue. Has a method for adding String elements at the head of the queue
 * 
 */
import java.util.Queue;

public class QueueProducer
{
	// Initialize a Queue for Strings to be used as a base for the constructor
	private Queue<String> prodList; // QueueProducer HAS-A Queue

	// Method for adding a String to the head of the queue
	public void produce(String string)
	{
		// Add the parameter String to the queue
		this.prodList.add(string);
		
		// Print queue with added element
		System.out.println("Current Queue: " + this.prodList);
	}

	// Constructor for the QueueProducer class, creates a new Queue and sets it equal to the parameter Queue
	public QueueProducer(Queue<String> list)
	{
		this.prodList = list;
	}
}
