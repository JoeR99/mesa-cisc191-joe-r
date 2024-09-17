package M4Middle;

/**
 * @author Joseph Rathbun
 * 
 * Version/Date: 09/16/2024
 * 
 */

import java.awt.Color;

public class Hero extends Player implements Upgradeable , Enhanceable
{

	private int upgradePoints;
	
	private int enhancePoints;
	
	public Hero(String playerName)
	{
		super(playerName);
		// TODO Auto-generated constructor stub
		
		setHealth(1000);
		
		setStrength(99);
		
		setColor(Color.WHITE);
	}

	@Override
	public int getUpgradePoints()
	{
		// TODO Auto-generated method stub
		System.out.println("Upgrade Points : " + this.upgradePoints);
		return upgradePoints;
	}

	@Override
	public void upgradePointsUp()
	{
		// TODO Auto-generated method stub
		upgradePoints ++;
	}

	@Override
	public void upgradePointsDown()
	{
		// TODO Auto-generated method stub
		upgradePoints --;
	}

	@Override
	public int getEnhancePoints()
	{
		// TODO Auto-generated method stub
		return enhancePoints;
	}

	@Override
	public void enhancePointsUp()
	{
		// TODO Auto-generated method stub
		enhancePoints ++;
	}

	@Override
	public void enhancePointsDown()
	{
		// TODO Auto-generated method stub
		enhancePoints --;
	}

}
