package M7GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 10/14/2024
 * 
 * Responsibilities of class:
 * 
 * Action Listener for the Fishing Button
 * 
 */

public class FishingButtonListener implements ActionListener
{	
	private GoneFishingModel goneFishingModel; // Initialize a GoneFishingModel field to be set equal to parameter when buttonListener is added
	
	private GoneFishingView goneFishingView; // Initialize a GoneFishingView field to be set equal to parameter when buttonListener is added
	
	private FishingButton fishButton; // Initialize a FishingButton field to be set equal to parameter when buttonListener is added
		
	ImageIcon icon = new ImageIcon("images/yellow-8fish-32.png");
	
	@Override
	public void actionPerformed(ActionEvent e)
	{		
		System.out.println("---- Click ----"); // Print upon button being clicked.
		
		goneFishingView.updateUI(); // Update GUI upon button being clicked (Adjusts sliders)
		
		fishButton.setEnabled(false); // Set Button to False so that it cannot be pressed again
		
		// If fishAt method returns true for the current row and column of the button, then set the text of the button to 'Fish'
		if(goneFishingModel.fishAt(fishButton.getRow(),fishButton.getColumn()) == true)
		{	
			fishButton.setText("Fish");
//			fishButton.setBackground(Color.GREEN);	
			fishButton.setIcon(icon); // Sets icon to fish picture
			fishButton.setDisabledIcon(icon); // When button is disabled allows icon to have color
			
			System.out.println("You Caught a Fish! | Row: " + (fishButton.getRow()+1) + " | Column: " +  (fishButton.getColumn()+1));
		}
		
		// If fishAt method returns false, then set the button's text to X and set the background color to red
		else
		{
			fishButton.setText("X"); 
			fishButton.setBackground(Color.RED);
			
			System.out.println("NOTHING HERE"); // Print this when button is not a fish
		}
		
		// If there are no more tries left and at least one fish to be found, then open a window that displays a losing message.
		if ( goneFishingModel.fishWin() == true )
		{
			JOptionPane.showMessageDialog(null, "Game Over - Fishes Win"); // Pop-Up a Small Window for losing the game.
			System.exit(0); // Closes Program after OptionPane resolves
		}
		
		// If there are no more fish left, then open a window that displays a winning message.
		if( goneFishingModel.playerWins() == true )
		{
			JOptionPane.showMessageDialog(null, "You WIN! :)"); // Pop-Up a Small Window for winning the game.
			System.exit(0); // Closes Program after OptionPane resolves
		}			
	}
	
	/**
	 * TODO
	 * @param goneFishingModel
	 * @param goneFishingView
	 * @param fishingButton
	 */
	public FishingButtonListener(GoneFishingModel goneFishingModel, GoneFishingView goneFishingView,
			FishingButton fishingButton)
	{
		// TODO
		 this.goneFishingModel = goneFishingModel;
	     this.goneFishingView = goneFishingView;
	     this.fishButton = fishingButton;
	}

}
