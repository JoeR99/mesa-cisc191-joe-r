package M4Middle;

/**
 * @author Joseph Rathbun
 * 
 * Version/Date: 09/16/2024
 * 
 */
import java.awt.Color;

public class Enemy extends Character
{

	public Enemy(String enemyName)
	{
		super(enemyName);
		
		this.health = 10;
		
		setColor(Color.RED);
	}
		
	@Override
	int getHealth()
	{
		// TODO Auto-generated method stub
		return this.health;
	}

	@Override
	void setHealth(int newHealth)
	{
		// TODO Auto-generated method stub
		this.health = newHealth;
	}

}
