package codeforvideos;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	
	MainPanel panel = new MainPanel();

	public MainFrame()
	{
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
}
