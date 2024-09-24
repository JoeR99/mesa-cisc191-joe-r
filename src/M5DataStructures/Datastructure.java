package M5DataStructures;
/**
 * @author Joseph Rathbun
 * 
 * * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html
 * 
 * Version / Date : 09/23/2024
 * 
 * Responsibilities of Class: Contains a method for checking any word and determining if it is a Palindrome or not.
 * 
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Datastructure
{
	// Method for checking any word and returns true or false depending on the parameter
	public static boolean isPalindrome(char[] letters)
	{
		// TODO:
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		
		// Initialize a stack and queue to add/push and to pop/poll later in the class
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<String>();
		
		// For loop to iterate through character array in the parameter
		// Puts the letters into a stack and a queue
		for ( int i = 0 ; i < letters.length ; i++)
		{
			// Makes a char variable and sets it equal to the current index in the parameter array
			char inputChar = letters[i];
			
			// Converts Char to String. 
			String inputString = new String(new char[] {inputChar});
			
			// Add the current letter in the array into the stack
			stack.push(inputString);
			
			// Add the current letter in the array into the queue
			queue.add(inputString);
		}

		// While loop to iterate through each letter in the stack and queue unless the stack or queue is empty
		while ( !stack.isEmpty() && !queue.isEmpty() )
		{
			// Remove the last letter in the array, return it and set fromStack equal to it
			String fromStack = stack.pop();
			
			// Remove the first letter in the array, return it and set fromQueue equal to it
			String fromQueue = queue.poll();
			
			// If the current letters being removed are not equal, then return false
			if ( !fromStack.equals(fromQueue) )
			{
				System.out.println("Not a Palindrome: " + stack );
				return false;
			}
		}
		// Return true if the letters passed through the above loop
		return true;
	}
}
