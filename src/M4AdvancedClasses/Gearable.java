package M4AdvancedClasses;


/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * @author 
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
 * Responsibilities of interface: Quick layout for methods to get the Gear
 * 								  and to increase and decrease the Gear number
 * 
 */
public interface Gearable
{
	/**
	 * 
	 * @return the gear that object is currently in
	 */
	int getGear();		
	
	// Change the gear's number, increasing it by 1
	void gearUp();
	
	// Change the gear's number, decreasing it by 1
	void gearDown();
	
	
}