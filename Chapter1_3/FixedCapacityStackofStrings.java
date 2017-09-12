package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class FixedCapacityStackofStrings 
{
	private String[] str;
	private int N;
	public FixedCapacityStackofStrings(int capacity)
	{
		str = new String[capacity];
		
	}
	public void push(String item)
	{
		str[N++] = item;
	}
	public String pop()
	{
		return str[--N];
	}
	public boolean isEmpty()
	{
		return N == 0;
	}
	public int size()
	{
		return N;
	}
	// Test Example:
	public static void main(String args[])
	{
		FixedCapacityStackofStrings str = new FixedCapacityStackofStrings(100);
		while(!StdIn.isEmpty())
		{
			String temp = StdIn.readString();
			if(!temp.equals("-")) str.push(temp);
			else if(!str.isEmpty()) StdOut.print(str.pop() + " ");
			
		}
		System.out.println("(" + str.size() + " left on this stack)");
		
		
	
	}
}
