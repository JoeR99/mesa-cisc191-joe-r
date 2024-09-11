package M3SeniorJosephRathbun;

public class Roster
{

	private Character[] characterData;
	
	
	public Character getCharacterAt(int slot)
	{
		return characterData[slot] ; 
	}
	
	public Character setCharacterAt(Character currentCharacter, int slot) 
	{
		Character tempCharacter = new Character();
		
		if (characterData[slot] != null)
		{
			System.out.println("This Slot is Taken!  |  MOVE OVER!!");
			tempCharacter = characterData[slot];
			
			characterData[slot] = currentCharacter;
			return tempCharacter;
		}
		else
		{
			characterData[slot] = currentCharacter;
			return null;
		}		
	}
	
	// toString for the Roster Class
	public String toString()
	{
		String rosterReport = "Slot 1: " + characterData[0] + " | Slot 2: " + characterData[1] + 
							  " | Slot 3: " + characterData[2] + " | Slot 4: " + characterData[3]; 
		System.out.println(rosterReport);
		return rosterReport;
	}
	
	// Roster constructor for holding an array of characters
	public Roster(int rosterSize)
	{	
		characterData = new Character[rosterSize];
	}
	
	public Character[] copyRoster()
	{		
		Character[] copy = new Character[characterData.length];
		
		for (int i = 0 ; i < characterData.length ; i++)
		{
			copy[i] = characterData[i];
		}
		
		return copy;	
	}
	
	
}
