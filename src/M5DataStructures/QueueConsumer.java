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
 * Responsibilities of class: Constructor creates a Queue. Has a method for removing the element at the head of the queue
 * 
 */
import java.util.Queue;

public class QueueConsumer
{
	// Initialize a Queue for Strings to be used as a base for the constructor
	private Queue<String> consList; // QueueConsumer HAS-A Queue

	// Method for removing the head of the Queue, returns null if the list is empty.
	public String consume()
	{
		// If queue is empty, then return null
		if ( this.consList.isEmpty() )
		{
			System.out.println("Queue is Empty: " + this.consList);
			return null;
		}
		
		// Create String as placeholder for element being removed, gets returned at the end
		String temp = this.consList.peek();
		
		// Remove the head of this queue
		this.consList.remove();
		
		//Print queue with removed element 
		System.out.println("Current Queue: " + this.consList);
		
		// Return the placeholder
		return temp;
	}

	// Constructor for the QueueConsumer class, creates a new Queue and sets it equal to the parameter Queue
	public QueueConsumer(Queue<String> list)
	{
		this.consList = list;
		System.out.println("Queue: " + this.consList);
	}
}
