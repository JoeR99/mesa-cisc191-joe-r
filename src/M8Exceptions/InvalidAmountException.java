package M8Exceptions;

/**
 * Lead Author(s):
 * @author Jospeh Rathbun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Throwable.html
 * Exception.class and Throwable.class
 *  
 * Version/date: 11/09/2024
 * 
 * Responsibilities of class:
 *  Exception handler for BankAccount. This is thrown when the requested amount is negative (less than zero).
 */
/**
 */
public class InvalidAmountException extends Exception
{	
	private double invalidAmount;
	
	public InvalidAmountException(double invalidAmount)
	{
        super();
        this.invalidAmount = invalidAmount;
	}	
	
	public String getMessage()
	{
		return "Negative amount: $" + invalidAmount  + " is not allowed";
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5437270767163297380L;
}
