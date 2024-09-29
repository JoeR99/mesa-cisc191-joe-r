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
 * Responsibilities of class: An interface for ElectricCars. A blueprint with methods for getting and adding battery charge,
 * 							  as well as setting the charge to the max amount.
 * 
 */

public interface Chargeable
{
	// Get the current charge of the ElectricCar's battery
	int getBatteryCharge();
	
	// Set the current charge to the max amount
	void chargeUp();
	
	// Add charge to the ElectricCar's battery
	void chargeUp(int addCharge);
}
