package M4Middle;

/**
 * @author Joseph Rathbun
 * 
 * Version/Date: 09/16/2024
 * 
 */

import java.awt.Color;

public class Player extends Character implements Stats
{

	private int strength;
	
	public Player(String playerName)
	{
		super(playerName);
		
		setHealth(100);
		
		setStrength(1);
		
		this.color = Color.GREEN;
	}
	
	@Override
	int getHealth()
	{
		// TODO Auto-generated method stub
		System.out.println("Health : " + this.health);
		return this.health;
	}

	@Override
	void setHealth(int newHealth)
	{
		// TODO Auto-generated method stub
		this.health = newHealth;
		System.out.println("New Health : " + this.health);
	}

	@Override
	public int getStrength()
	{
		// TODO Auto-generated method stub
		System.out.println("Strength : " + this.strength);
		return strength;
	}
	
	@Override
	public void setStrength(int newStrength)
	{
		// TODO Auto-generated method stub
		this.strength = newStrength;
		System.out.println("New Strength : " + this.strength);
	}

	@Override
	public void strengthUp()
	{
		// TODO Auto-generated method stub
		strength ++;
	}

	@Override
	public void strengthDown()
	{
		// TODO Auto-generated method stub
		strength --;
	}
}
