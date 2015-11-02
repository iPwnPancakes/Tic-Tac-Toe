package gameLogic;

import tHandler.THandler;
import tableSet.SetTable;


public class addXO extends THandler
{
	//Declare variables
	private static final long serialVersionUID = 1L;
	public static String s = "CLICK HERE";
	
	public static String AddXO(int r,int c,int i)
	{
		WhosTurn turnMaster = new WhosTurn();
		
			//Sets a variable equal to whos turn it is. If it is X's turn it makes the button an x and vice versa with O//
		if (WhosTurn.getTurn() == 1)
				{
						setXO("X");
						SetTable.setValueAt(s, r, c);
						turnMaster.setTurn(2);
				}
		else if(WhosTurn.getTurn() == 2)
				{
						setXO("O");
						SetTable.setValueAt(s, r, c);
						turnMaster.setTurn(1);
				}
		return s;
	}
	
	public static void setXO(String t)
			{
				s = t;
			}
	
	public static String getXO()
			{
				return s;
			}
	
}
