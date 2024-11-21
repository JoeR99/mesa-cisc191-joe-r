package codeforvideos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener
{

	JButton button = new JButton("Click Me!");
	
	public MainPanel()
	{
		this.setPreferredSize(new Dimension(500,500));
		this.setBackground(Color.CYAN);
		
		this.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("--- Click ---");
	}
	
}
