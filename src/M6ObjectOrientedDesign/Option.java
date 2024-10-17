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
 * Version/date: 10/17/2024
 * 
 * Responsibilities of class: Creates a simple string object as an option. Used with Vehicle class to make an array of this type of object.
 * 
 */

public class Option
{
	private String option; // Option HAS-A String

	public Option()
	{
		option = null;
	}
	
	public String getDetails() // Accessor for Option
	{
		return option;
	}
	
	public Option(String newOption) 
	{
		this();
		
		option = newOption;
		
		System.out.println("Option Added: " + option);
	}
}
