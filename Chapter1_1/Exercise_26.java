package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_26 {

	public static void main(String[] args) 
	{
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		
		if(a > b)
		{
			a = a ^ b;
			b = a ^ b;// b = a ^ b ^ b, and b ^ b == 0 
			a = a ^ b;
		}
		if(a > c)
		{
			a = a ^ c;
			c = a ^ c;
			a = a ^ c;
		}
		if(b > c)
		{
			b = b ^ c;
			c = b ^ c;
			b = b ^ c;
		}
		System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n");
	}

}
