package M4AdvancedClasses;

/**
 * Lead Author(s):
 * @author Joseph Rathbun 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 09/16/2024
 * 
 * Responsibilities of class: A collection of method headers that define what it means to be a bike with charge.
 * 
 */
/**
 */

public interface Electric
{
	// Getter method for grabbing the bike's current charge
	int getCharge();
	
	// Setter method for changing the bike's charge to the parameter value (integer)
	void charge(int newCharge);
	
}
