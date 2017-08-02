package Chapter1_1;


import edu.princeton.cs.introcs.StdOut;

public class Exercise_19 {

	public static long Fibonacci1(int N)
	{
		if(N == 0)	return 0;
		if(N == 1)	return 1;
		return Fibonacci1(N - 1) + Fibonacci1(N - 2);
		
	}
	public static long[] Fibonacci2(int N)
	{
		long[] Fibonacci = new long[100];
		if(N == 0) Fibonacci[0] = 0;
		else if(N == 1) Fibonacci[1] = 1;
		else if(N == 2) Fibonacci[2] = 1;
		else 
		{
			double sqrtOf5 = Math.sqrt(5);
			for (int i = 0; i <= N; i++) 
			{
				Fibonacci[i] = (long) (1 / sqrtOf5 * (Math.pow((1 + sqrtOf5) / 2, i) - Math.pow((1 - sqrtOf5) / 2, i)));
			}
			
		}
		return Fibonacci;
	}
	public static void main(String[] args) {
		long[] Fibonacci = Fibonacci2(99);
		for (int N = 0; N < 100; N++) 
		{
			StdOut.println(N + ": " + Fibonacci[N]);
		}

	}

}
