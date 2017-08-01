package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_09 {

	public static void main(String args[])
	{
		int N = StdIn.readInt();
		String s = "";
		for( ; N > 0; N /= 2)
		{
			s = N % 2 + s;
			
		}
		
		System.out.println(s);
	}
}
