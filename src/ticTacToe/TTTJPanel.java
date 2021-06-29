package ticTacToe;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class TTTJPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5143501434190960423L;
	public boolean free;
	int xpos;
	int ypos;
	char value = ' ';
	public static boolean spielVorbei = false;
	
	

	public TTTJPanel(int x, int y) 
	{
		this.xpos = x;
		this.ypos = y;
		this.free = true;
		
		this.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		this.setPreferredSize(new Dimension(50,50));
		this.addMouseListener(new MouseListener()
		
				{
			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				if(free)
				{
					if(StarteSpiel.amZug%2 ==0)
					{
						JLabel x = new JLabel("X");
						TTTJPanel.this.value = 'x';
						x.setFont(new Font("Arial", Font.BOLD, 30));
						TTTJPanel.this.add(x);
						TTT_Gui.info.setText("  O ist dran");
					}
					else if(StarteSpiel.PLAYER2_IS_HUMAN)
					{
						JLabel o = new JLabel("O");
						TTTJPanel.this.value = 'O';
						o.setFont(new Font("Arial", Font.BOLD, 30));
						TTTJPanel.this.add(o);
						TTT_Gui.info.setText(" X ist dran");
					}
					StarteSpiel.amZug++;
					free = false;
					TTTJPanel.this.revalidate();
				}
				if(TTTJPanel.this.horizontalgewonnen() || TTTJPanel.this.vertikalgewonnen() || TTTJPanel.this.diagonalgewonnen())
				{
					spielVorbei = true;
					JOptionPane.showMessageDialog(TTTJPanel.this, "Spiel vorbei, " + TTTJPanel.this.value + " hat gewonnen");
				}
				else if(StarteSpiel.amZug>8)
				{
					spielVorbei = true;
					JOptionPane.showMessageDialog(TTTJPanel.this, "Spiel vorbei, UNENTSCHIEDEN");
					System.exit(0);
				;}
				if(!StarteSpiel.PLAYER2_IS_HUMAN && !spielVorbei)
				{
					JLabel o = new JLabel("O");
					int x = -1; int y = -1;
					LOOP: for (int i = 0; i <= 2; i++) 
					{
						for (int j = 0; j <= 2; j++) 
						{
							if(TTT_Gui.fields[i][j].value == ' ')
							{
								x = i; y = j;
								System.out.println(" Setze " + x + " " + y);
								break LOOP;
							}
						}
					}
					TTT_Gui.fields[x][y].value= 'O';
					o.setFont(new Font("Arial", Font.BOLD, 30));
					TTT_Gui.fields[x][y].add(o);
					TTT_Gui.info.setText(" X ist dran");
					StarteSpiel.amZug++;
				}
			}
				
			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			
			     

				@Override
				public void mouseClicked(MouseEvent e)
				{
					
				}
				});

				

				

				

				
	}





	protected boolean diagonalgewonnen()
	{
		if (
				(
						this.value != ' '
						&& this.xpos == this.ypos
						&& TTT_Gui.fields[0][0].value == TTT_Gui.fields[1][1].value
						&& TTT_Gui.fields[0][0].value == TTT_Gui.fields[2][2].value)
						
				|| (   this.value != ' '
						&& this.xpos + this.ypos == 2
						&& TTT_Gui.fields[0][2].value == TTT_Gui.fields[1][1].value
						&& TTT_Gui.fields[0][2].value == TTT_Gui.fields[2][0].value)
			)
				
				{
						
		return true;
	}
						else
						{
							return false;
						}
	}
	
	protected boolean horizontalgewonnen()
	{
		if( this.value != ' '
				&& TTT_Gui.fields[xpos][0].value == TTT_Gui.fields[xpos][1].value
				&& TTT_Gui.fields[xpos][0].value == TTT_Gui.fields[xpos][2].value)
		{
			return true;
		}
		else
		{
		return false;
	}
	}



	protected boolean vertikalgewonnen()
	{
		if( this.value != ' '
				&& TTT_Gui.fields[ypos][0].value == TTT_Gui.fields[ypos][1].value
				&& TTT_Gui.fields[ypos][0].value == TTT_Gui.fields[ypos][2].value)
		{
			return true;
		}
		else
		{
		return false;
	}
	}
	}
		
	


	

