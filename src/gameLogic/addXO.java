package gameLogic;

import setter.Setter;
import tHandler.THandler;


public class addXO extends THandler
{
	private static final long serialVersionUID = 1L;
	//Declare variables
	public static String s = "CLICK HERE";
	public static String AddXO(int r,int c,int i)
	{
		WhosTurn turnMaster = new WhosTurn();
		
			//Sets a variable equal to whos turn it is. If it is X's turn it makes the button an x and vice versa with O//
		if (WhosTurn.getTurn() == 1)
		{
				setXO("X");
				Setter.setValueAt(s, r, c);
				turnMaster.setTurn(2);
		}
		else if(WhosTurn.getTurn() == 2)
		{
				setXO("O");
				Setter.setValueAt(s, r, c);
				turnMaster.setTurn(1);
		}
		return s;
	}
	public static void setXO(String t){
		s = t;
	}
	public static String getXO(){
		return s;
	}
	
}
