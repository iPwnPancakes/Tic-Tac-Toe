package tableSet;

public class SetTable {
	
	String[] columnNames = {"c1","c2","c3"};
	
	public static String[][] data = 
		{
			{"--", "--", "--"},
			{"--", "--", "--"},
			{"--", "--", "--"}
		};
	static boolean x;
	
	public static void setValueAt(String s, int r, int c)
			{
				data[r][c] = s;
			}
	public static void setTF(boolean tORf)
			{
				x = tORf;
			}
	public boolean getTF()
			{
				return x;
			}
	public static String getDataValueAt(int r, int c)
			{
				return data[r][c];
			}
}
