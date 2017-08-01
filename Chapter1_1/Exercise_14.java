package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_14 {

	public static int lg(int N)
	{
		int base = 2;
		int exponent = 0;
		for (; base <= N; base *= 2) {
			++exponent;
		}
		return exponent;
	}
	public static void main(String args[])
	{
		int N = StdIn.readInt();
		System.out.println(lg(N));
	}
}
