package gameLogic;

public class WhosTurn 
{
	protected static int t = 1;
	
	public void setTurn(int i)
	{
		t = i;
	}
	
	public static int getTurn()
	{
		return t;
	}
}
