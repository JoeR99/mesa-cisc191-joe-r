package M4Middle;

/**
 * @author Joseph Rathbun
 * 
 * Version/Date: 09/16/2024
 * 
 */

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Hero Joe = new Hero("Joe");
		
		Joe.toString();		
		
		Player Joey = new Player("Joey");
		
		Joey.toString();		
		
		Character Joseph = new Player("Joseph");
		
		Joseph.toString();
		
		Joe.getStrength();
		Joey.getStrength();
		
		Joe.getUpgradePoints();
		
		Joe.upgradePointsUp();
		Joe.upgradePointsUp();
		Joe.upgradePointsUp();
		
		Joe.getUpgradePoints();
	
		Joe.upgradePointsDown();
		
		Joe.getUpgradePoints();
	}

}
