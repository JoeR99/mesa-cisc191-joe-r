package M11Multithreading;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * Lead Author(s):
 * 
 * @author Joseph Rathbun
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:
 * 
 * Responsibilities of class:
 * An engine is an independent thread
 * An engine has a fuel level
 * An engine tracks its use of fuel when it runs, using one unit per second
 * An engine stops when it runs out of fuel
 */


public class Engine extends Thread implements ActionListener
{
	private int currentFuel; // Tracks the fuel level
		
	private Timer timer;
	
	public int getFuelLevel()
	{
		return currentFuel;
	}
	
	public Engine()
	{
		this.currentFuel = 10;
		this.timer = new Timer(1000, this);	
	}
	
	public void setFuelLevel(int fuel)
	{
		System.out.println("Fuel level set to: " + fuel);

		currentFuel = fuel;
	}
	
	@Override
	public void run()
	{
		// TODO
		System.out.println("running...");
		
		for (int counter = 0 ; counter < currentFuel ; counter++)
		{
			if ( currentFuel > 0 ) {
				currentFuel--;
			}
			
			System.out.println("Fuel level: " + currentFuel);
			
		}
		
		System.out.println("ending...");
		timer.stop();
	}
	
	public void start()
	{		
		timer.start();
		
		if ( this.isAlive() ) {
			System.out.println("ALIVE? : YES!");
		}
		else {
			System.out.println("ALIVE? : NO!");

		}
		
	}
	
	public void loseFuel()
	{
		if ( currentFuel > 0 )
		{
			currentFuel--;
			System.out.println("Fuel level: " + currentFuel);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		loseFuel();

	}
}
