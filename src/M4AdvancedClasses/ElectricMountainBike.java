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
 * Responsibilities of class:
 * ElectricMountainBike is a Bicycle that is Movable, Gearable, and Electric
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements) relationships separately

//ElectricMountainBike IS-A Bicycle AND IS-A Gearable AND IS-AN Electric AND IS-A Movable
public class ElectricMountainBike extends Bicycle implements Gearable , Electric , Movable 
{
	// Initialize integer variable for the bike's current gear number
	private int gear;
	
	// Initialize integer variable for the bike's current charge
	private int charge;
	
	// Initialize integer variable for the bike's current speed
	private int speed;
	
	public ElectricMountainBike(String newMake)
	{
		super(newMake);
		
		gear = 1;
		// TODO Auto-generated constructor stub
	}
	// TODO: Implement and comment HAS-A relationships separately

	@Override
	// Getter method for grabbing the bike's Gear number;
	public int getGear()
	{
		// TODO Auto-generated method stub
		return gear;
	}

	@Override
	// Method for increasing the bike's gear number by 1
	public void gearUp()
	{
		gear ++;;
		
	}

	@Override
	// Method for decreasing the bike's gear number by 1
	public void gearDown()
	{
		// TODO Auto-generated method stub
		this.gear --;
	}

	@Override
	// Getter method for grabbing the current charge of the bike
	public int getCharge()
	{
		// TODO Auto-generated method stub
		return charge;
	}

	@Override
	// Setter method for changing the current charge of the bike to the integer parameter value
	public void charge(int newCharge)
	{
		// TODO Auto-generated method stub
		charge = newCharge;
	}

	@Override
	// Getter method for grabbing the bike's current speed
	public int getSpeed()
	{
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	// Method for increasing the bike's speed by 1
	public void speedUp()
	{
		// TODO Auto-generated method stub
		speed ++;
	}
}

