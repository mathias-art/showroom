package ticTacToe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TTT_Gui
{
	JFrame mainf;
	JPanel mainp;
	public static JLabel info;
	
	JPanel innerp;
	static TTTJPanel [] [] fields;
	
	public TTT_Gui()
	{
		super();
		this.mainf = new JFrame();
		this.mainp = new JPanel();
		mainp.setLayout(new BorderLayout());
		
		info = new JLabel("Spielbeginn");
		mainp.add(info, BorderLayout.NORTH);
		
		this.innerp = new JPanel();
		mainp.add(innerp, BorderLayout.CENTER);
		
		innerp.setLayout(new GridLayout(3,3));
		fields = new TTTJPanel[3][3];
		
		for (int i = 0; i < fields.length; i++) 
		{
			for (int j = 0; j < fields[i].length; j++) 
			{
				fields[i][j] = new TTTJPanel(i,j);
				innerp.add(fields[i][j]);
			}
			
		}
		mainf.add(mainp);
		
		mainf.pack();
		mainf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainf.setLocationRelativeTo(null);
		mainf.setVisible(true);
		
	}

}
