package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_05 {

	public static void main(String args[])
	{
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		
		System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
	}
	
	
}
