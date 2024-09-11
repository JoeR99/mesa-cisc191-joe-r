package M3SeniorJosephRathbun;

public class Character
{
	
	// Initialize String variable for the name of the character
	private String characterName; // Character HAS-A Name
	
	// Initialize integer variable for the character's total health
	private int characterHealth; // Character HAS-A Health
	
	// Initialize integer variables for the character's talent points
	private int characterStrength; // Character HAS-A Strength
	private int characterDexterity; // Character HAS-A Dexterity
	private int characterIntelligence; // Character HAS-A Intelligence
	
	// Initialize a Character array for character data
	private Character[] characterData;
	
	// Getter method for grabbing the Name of the Character
	public String getName()
	{
		return characterName;
	}
	
	// Setter method for changing the Name of the Character
	public void setName(String name)
	{
		characterName = name;
	}
	
	// Getter method for grabbing the Health of the Character
	public int getHealth()
	{
		return characterHealth;
	}
	
	// Setter method for changing the Health of the Character
	public void setHealth(int health)
	{
		characterHealth = health;
	}
	
	// Getter method for grabbing the Strength of the Character
	public int getStrength()
	{
		return characterStrength;
	}
	
	// Setter method for changing the Strength of the Character
	public void setStrength(int newStrength)
	{
		characterStrength = newStrength;
	}
	
	
	// Getter method for grabbing the Dexterity of the Character
	public int getDexterity()
	{
		return characterDexterity;
	}
	
	// Setter method for changing the Dexterity of the Character
	public void setDexterity(int newDexterity)
	{
		characterDexterity = newDexterity;
	}
	
	
	// Getter method for grabbing the Intelligence of the Character
	public int getIntelligence()
	{
		return characterIntelligence;
	}
	
	// Setter method for changing the Intelligence of the Character
	public void setIntelligence(int newIntelligence)
	{
		characterIntelligence = newIntelligence;
	}
	
	// toString for Character class to see the Character's data
	public String toString()
	{
		// String that reports the Name, Health, Strength, Dexterity, and Intelligence of the 
		String characterReport = "Name: " + characterName + " | Health: " + characterHealth + " | Strength: " + characterStrength +
								 " | Dexterity: " + characterDexterity + " | Intelligence: " + characterIntelligence; 
		
		System.out.println(characterReport);
		
		return characterReport;
	}
	
	// Default Constructor for character creation
	public Character()
	{
		characterName = null;
		characterHealth = 10 ; 
		characterStrength = 1;
		characterDexterity = 0;
		characterIntelligence = 0;	
		
	}
	
	// Copy Constructor for getting the values of the character parameter and copying each value to a new character
	public Character(Character mainCharacter)
	{	
		this();
		
		characterName = mainCharacter.getName();
		characterHealth = mainCharacter.getHealth() ; 
		characterStrength = mainCharacter.getStrength();
		characterDexterity = mainCharacter.getDexterity();
		characterIntelligence = mainCharacter.getIntelligence();	
	}
	
	// Constructor for creating a character with specific values
	public Character(String name, int health, int strength, int dexterity, int intelligence)
	{
		// Initialize Character variables
		this();
		
		// Set the Character's name, health, strength, dexterity, and intelligence to the parameter values, respectively
		characterName = name ; characterHealth = health ; characterStrength = strength ; characterDexterity = dexterity ; characterIntelligence = intelligence ; 
		
	}
	
}