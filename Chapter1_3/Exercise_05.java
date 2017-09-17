package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Exercise_05 {

	public static void main(String[] args) 
	{
		int N = StdIn.readInt();
		Stack<Integer> stack = new Stack<Integer>();
		while(N > 0)
		{
			stack.push(N % 2);
			N /= 2;
		}
		StdOut.print("Binary:");
		for(int cur : stack)
		{
			
			StdOut.print(cur);
		}

	}

}
