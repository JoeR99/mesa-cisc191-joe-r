package M3SeniorJosephRathbun;



public class CharacterMain
{

	public static void main(String[] args)
	{
		
		Character Joe = new Character();
		
		Joe.setName("Joseph Rathbun");
		Joe.setHealth(100);
		Joe.setStrength(33);
		Joe.setDexterity(11);
		Joe.setIntelligence(99);
		
		Joe.toString();
		
		Character copyJoe = new Character(Joe);	
		
		Joe.setName("The GOOD Joe");
		Joe.setHealth(1000);
		Joe.setStrength(1000);
		Joe.setDexterity(1000);
		Joe.setIntelligence(1000);
		
		Roster roster = new Roster(4);
		roster.toString();
		
		
		roster.setCharacterAt(copyJoe, 0);
		roster.setCharacterAt(Joe, 2);
		
		Character[] copyRoster = roster.copyRoster();
		
		roster.toString();
		copyRoster.toString();
	}
	
}
