package M7GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * Other contributors:
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
 * GUI of the Fishing Game. Contains the actionListener being added to the Fishing Button.
 * 
 */

@SuppressWarnings("serial")
public class GoneFishingView extends JFrame
{	
	// Initialize JSlider to show the user how many tries and fish are left in the game
	private JSlider triesRemainingSlider = new JSlider(JSlider.VERTICAL, 0, 30, 30);
	private JSlider fishRemainingSlider = new JSlider(JSlider.VERTICAL, 0, 10,  10);
	
	private GoneFishingModel goneFishingModel;
	
	public GoneFishingView(GoneFishingModel model)
	{
		this.setTitle("Gone Fishing"); // Set the Title of the GUI
		this.setLayout(new BorderLayout()); // Set the Layout of the GUI
		
		// NORTHERN PANEL ************************************************************************************************************* //

		// -----EMPTY-----
		
		// WESTERN PANEL ************************************************************************************************************* //
				
		// Initialize JPanel to add a JLabel and apply to the WEST of the Layout
		JPanel intructionsPanel = new JPanel();
		
		// Initialize JLabel with instructions on how to play the game
		JLabel intructionsLabel = new JLabel("Click on the Buttons to Fish!");
		
		intructionsPanel.add(intructionsLabel); // Add Instruction Label to West Panel
		
		this.add(intructionsPanel, BorderLayout.WEST); // Add Panel to WEST 
		
		// CENTER PANEL ************************************************************************************************************* //
				
		// Initialize JPanel to add fish buttons
		JPanel gamePanel = new JPanel();
		
		// Set Layout to Grid with size of DIMENSION x DIMENSION found in GoneFishingModel
		gamePanel.setLayout(new GridLayout(GoneFishingModel.DIMENSION,GoneFishingModel.DIMENSION));
		
		// Nested Loop that adds a fishing button to each grid index
		for ( int i = 0 ; i < GoneFishingModel.DIMENSION ; i++ )
		{		
			for ( int j = 0 ; j < GoneFishingModel.DIMENSION ; j++)
			{	
				FishingButton fish = new FishingButton(i,j); // Create a FishingButton at each grid point
				
				fish.addActionListener(new FishingButtonListener(model, this, fish)); // Add Button Listener to Button
				
				gamePanel.add(fish); // Add Button to Game Panel every loop		
			}
		}
			
		this.add(gamePanel, BorderLayout.CENTER); // Add Panel to the CENTER of the Layout
		
		// EASTERN PANEL ************************************************************************************************************* //
		
		// Initialize JPanel to add sliders to
		JPanel easternPanel = new JPanel();

		// Labels to be added to panel next to respective slider
		JLabel triesLabel = new JLabel("Tries");
		JLabel fishLabel = new JLabel("Fish");
		
		// Enable sliders to have ticks with numbered labels with specific spacing
		// Disable the sliders to prevent user from changing values
		triesRemainingSlider.setMajorTickSpacing(10); 
		triesRemainingSlider.setPaintTicks(true);
		triesRemainingSlider.setPaintLabels(true);
		triesRemainingSlider.setEnabled(false);
		
		fishRemainingSlider.setMajorTickSpacing(5);
		fishRemainingSlider.setPaintTicks(true);
		fishRemainingSlider.setPaintLabels(true);
		fishRemainingSlider.setEnabled(false);
		
		easternPanel.add(triesRemainingSlider); // Add Sliders and Respective Labels to Panel
		easternPanel.add(triesLabel);
		easternPanel.add(fishRemainingSlider);
		easternPanel.add(fishLabel);
		
		this.add(easternPanel, BorderLayout.EAST); // Add the Eastern Panel to the EAST of the Layout
		
		// SOUTHERN PANEL ************************************************************************************************************* //
				
		// Initialize JPanel to add a JLabel and apply to the SOUTH of the Layout
		JPanel southPanel = new JPanel();
		
		// Initialize JLabel that prints the programmer of this GUI
		JLabel nameLabel = new JLabel("Programmed By: Joseph Rathbun", JLabel.CENTER);
		
		southPanel.add(nameLabel); // Add Name Label to South Panel
		
		this.add(southPanel, BorderLayout.SOUTH); // Add Panel to the SOUTH of the Layout
		
		// ************************************************************************************************************* //
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Enable Closing the GUI
		pack(); // Sets the size of the window automatically, using the panels added and their contents into the spacing process.
		setVisible(true); // Enable to GUI to be seen
		
		goneFishingModel = model; // Set the shallow copy equal to the parameter model
	}

	/**
	 * Starts the game
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		new GoneFishingView(new GoneFishingModel());
	}

	public void updateUI()
	{
		// Update both slider values to the current tries and fish remaining in the GoneFishingModel
		triesRemainingSlider.setValue(goneFishingModel.getTriesRemaining());
		fishRemainingSlider.setValue(goneFishingModel.getFishRemaining());
	}
}

