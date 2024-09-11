package M3SeniorJosephRathbun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterTest
{

	@Test
	void testNoArgCharacter()
	{
		// Create a character using the default constructor
		Character Bob = new Character();
		assertEquals(null, Bob.getName());
		assertEquals(10, Bob.getHealth());
		assertEquals(1, Bob.getStrength());
		assertEquals(0, Bob.getDexterity());
		assertEquals(0, Bob.getIntelligence());
		
		// Print information data of current character
		Bob.toString();
		
	}

	@Test
	void testConstructor()
	{
		// Use Character constructor to make a character with 5 parameters, test each parameter
		Character Joe = new Character("Joe",99,10,5,150);
		assertEquals("Joe", Joe.getName());
		assertEquals(99, Joe.getHealth());
		assertEquals(10, Joe.getStrength());
		assertEquals(5, Joe.getDexterity());
		assertEquals(150, Joe.getIntelligence());
		
		// Print information data of current character
		Joe.toString();
	}
	
	@Test
	void testAccessorsAndMutators()
	{
		Character Joe = new Character("Joe",99,10,5,150);
		
		// Change the Name of Joe, then test the results
		Joe.setName("Star");
		assertEquals("Star", Joe.getName());
		
		// Change the Health of Joe, then test the results
		Joe.setHealth(999);
		assertEquals(999, Joe.getHealth());
		
		// Change the Strength of Joe, then test the results
		Joe.setStrength(88);
		assertEquals(88, Joe.getStrength());
		
		// Change the Dexterity of Joe, then test the results
		Joe.setDexterity(777);
		assertEquals(777, Joe.getDexterity());
		
		// Change the Intelligence of Joe, then test the results
		Joe.setIntelligence(-333);
		assertEquals(-333, Joe.getIntelligence());
		
		// Print information data of current character
		Joe.toString();
		
	}
	
	@Test
	void testCopyConstructor()
	{
		Character Hank = new Character("Hanked Out", 3, 4, 5, 6);
		
		Hank.setHealth(11);
		
		Character Stank = new Character(Hank);
		
		assertEquals("Hanked Out", Stank.getName());
		assertEquals(11, Stank.getHealth());
		assertEquals(4, Stank.getStrength());
		assertEquals(5, Stank.getDexterity());
		assertEquals(6, Stank.getIntelligence());
		
	}
	
	@Test
	void testRoster()
	{
		
		Roster roster = new Roster(4);
		
		Character Joe = new Character("Joker", 50, 9, 8, 7);
		
		assertEquals(null, roster.getCharacterAt(0));
		assertEquals(null, roster.getCharacterAt(1));
		assertEquals(null, roster.getCharacterAt(2));
		assertEquals(null, roster.getCharacterAt(3));
		
		assertEquals(null, roster.setCharacterAt(Joe, 2));
		
		roster.setCharacterAt(Joe, 2);
		
		Character[] milk = roster.copyRoster();
		
		Character antiJoe = new Character("Anti Joe", 1, -33, -99, -888);
		
		roster.setCharacterAt(antiJoe, 0);
		
		roster.copyRoster().toString();		
		assertArrayEquals(new Character[]{null,null,Joe,null}, milk);
		assertEquals(new Character[]{antiJoe,null,Joe,null}, roster.copyRoster());

		
	}
	
	
	
	
	
	
	
	
	
	
}
