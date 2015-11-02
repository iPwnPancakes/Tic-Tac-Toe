package tHandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gameLogic.WhosTurn;
import gameLogic.addXO;
import tableSet.SetTable;

//TODO MAKE AN ARRAY FOR THE BUTTON NAMES AND THEIR .getText() VALUES

public class THandler extends JFrame
{
	public static boolean gameWon = false;
	//ALSO CHECKS FOR WIN IN MAIN
	public static void main(String[] args)
	{
		//String whoWon = null, 
		String tWin = "SOMEONE WON HELL YEA";
		//String winMessage = "Congradulations to " + whoWon + "! You won!";
		new THandler();
		
		while(gameWon == false)
		{
			//WIN CONDITION FOR TOP LEFT TO BOTTOM RIGHT DIAGONAL X's and O's
	        if((a1.getText() == "X" && b2.getText() == "X" && c3.getText() == "X") || (a1.getText() == "O" && b2.getText() == "O" && c3.getText() == "O"))
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR TOP RIGHT TO BOTTOM LEFT DIAGONAL X's AND O's
	        else if((a3.getText() == "X" && b2.getText() == "X" && c1.getText() == "X") || (a3.getText() == "O" && b2.getText() == "O" && c1.getText() == "O"))
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR LEFT COLUMN
	        else if((a1.getText() == "X" && a2.getText() == "X" && a3.getText() == "X") || a1.getText() == "O" && a2.getText() == "O" && a3.getText() == "O")
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR MIDDLE COLUMN
	        else if((b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X") || b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O")
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR RIGHT COLUMN
	        if((c1.getText() == "X" && c2.getText() == "X" && c3.getText() == "X") || c1.getText() == "O" && c2.getText() == "O" && c3.getText() == "O")
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR TOP ROW
	        else if((a1.getText() == "X" && b1.getText() == "X" && c1.getText() == "X")||(a1.getText() == "O" && b1.getText() == "O" && c1.getText() == "O"))
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR MIDDLE ROW
	        else if((a2.getText() == "X" && b2.getText() == "X" && c2.getText() == "X")||(a2.getText() == "O" && b2.getText() == "O" && c2.getText() == "O"))
	        {
	        	System.out.println(tWin);
	        	break;
	        }
	        //WIN CONDITION FOR BOTTOM ROW
	        else if((a3.getText() == "X" && b3.getText() == "X" && c3.getText() == "X")||(a3.getText() == "O" && b3.getText() == "O" && c3.getText() == "O"))
	        {
	        	System.out.println(tWin);
	        	break;
	        }
		}
		mainJPanel.setBackground(Color.GREEN);
		gameWon = true;
	}
	
	private static final long serialVersionUID = -5932345902843533513L;
	int dv1 = 0;
	int dv2 = 0;
	public static JButton a1 = new JButton(SetTable.getDataValueAt(0,0));
	public static JButton a2 = new JButton(SetTable.getDataValueAt(0,1));
	public static JButton a3 = new JButton(SetTable.getDataValueAt(0,2));
	public static JButton b1 = new JButton(SetTable.getDataValueAt(1,0));
	public static JButton b2 = new JButton(SetTable.getDataValueAt(1,1));
	public static JButton b3 = new JButton(SetTable.getDataValueAt(1,2));
	public static JButton c1 = new JButton(SetTable.getDataValueAt(2,0));
	public static JButton c2 = new JButton(SetTable.getDataValueAt(2,1));
	public static JButton c3 = new JButton(SetTable.getDataValueAt(2,2));
	public static JPanel mainJPanel = new JPanel();
	
	public THandler() 
	{
		// JPanel bounds
		mainJPanel.setBounds(800, 800, 200, 80);
        
		a1.setBounds(60, 400, 59, 50);
		a2.setBounds(70, 400, 220, 30);
		a3.setBounds(80, 400, 220, 30);
		b1.setBounds(60, 500, 220, 30);
		b2.setBounds(70, 500, 220, 30);
		b3.setBounds(80, 500, 220, 30);
		c1.setBounds(60, 600, 220, 30);
		c2.setBounds(70, 600, 220, 30);
		c3.setBounds(80, 600, 220, 30);
		
		//the action is passing the coordinates through addXO
		a1.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(0,0,WhosTurn.getTurn());
        		a1.setText(addXO.getXO());
        	  };
        });
		a2.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(1,0,WhosTurn.getTurn());
        		a2.setText(addXO.getXO());
        	  };

        });
		a3.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(2,0,WhosTurn.getTurn());
        		a3.setText(addXO.getXO());
        	  };

        });
		b1.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(1,0,WhosTurn.getTurn());
        		b1.setText(addXO.getXO());
        	  };

        });
		b2.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(1,1,WhosTurn.getTurn());
        		b2.setText(addXO.getXO());
        	  };

        });
		b3.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(1,2,WhosTurn.getTurn());
        		b3.setText(addXO.getXO());
        	  };

        });
		c1.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(2,0,WhosTurn.getTurn());
        		c1.setText(addXO.getXO());
        	  };

        });
		c2.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(2,1,WhosTurn.getTurn());
        		c2.setText(addXO.getXO());
        	  };

        });
		c3.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent event) 
        	  {
        		addXO.AddXO(2,2,WhosTurn.getTurn());
        		c3.setText(addXO.getXO());
        	  };

        });
		
		mainJPanel.add(a1);
        add(mainJPanel);
        mainJPanel.add(a2);
        add(mainJPanel);
        mainJPanel.add(a3);
        add(mainJPanel);
        mainJPanel.add(b1);
        add(mainJPanel);
        mainJPanel.add(b2);
        add(mainJPanel);
        mainJPanel.add(b3);
        add(mainJPanel);
        mainJPanel.add(c1);
        add(mainJPanel);
        mainJPanel.add(c2);
        add(mainJPanel);
        mainJPanel.add(c3);
        add(mainJPanel);
        
        // JFrame properties
        setSize(170, 140);
        setBackground(Color.BLACK);
        setTitle("T3");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
	}
}
