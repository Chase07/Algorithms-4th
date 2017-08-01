package Chapter1_1;

import edu.princeton.cs.introcs.StdOut;

public class Exercise_06 {

	public static void main(String args[])
	{
		int f = 0;
		int g = 0;
		for (int i = 0; i <= 15; i++) 
		{
			StdOut.println(f);// fifteen numbers of zero
			f = f + g;
			g = f - g;
			
		}
		
	}
}
