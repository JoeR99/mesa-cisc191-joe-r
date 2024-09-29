package M6ObjectOrientedDesign;
/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 09/24/2024
 * 
 * Responsibilities of class: An interface for GasCars. A blueprint with methods for getting and adding fuel.
 * 							  Another method for setting the fuel to the max amount.
 * 
 */

public interface Combustible
{
	// Get the fuel of the GasCar
	int getFuelLevel();
	
	void tankUp();
	
	// Add fuel to the GasCar
	void addFuel(int newFuel);
}

