package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class FixedCapacityStack<Item> {

	private Item[] items;
	private int N;
	public FixedCapacityStack(int capacity)
	{
		items = (Item[]) new Object[capacity];
	}
	public void push(Item elem)
	{
		items[N++] = elem;
	}
	public Item pop()
	{
		return items[--N];
	}
	public int size()
	{
		return N;
	}
	public boolean isEmpty()
	{
		return N == 0;
	}
	public static void main(String[] args) 
	{
		FixedCapacityStack<String> str = new FixedCapacityStack<>(100);
		while(!StdIn.isEmpty())
		{
			String temp = StdIn.readString();
			if(!temp.equals("-")) str.push(temp);
			else if(!str.isEmpty()) StdOut.print(str.pop() + " ");
			
		}
		StdOut.println("(" + str.size() + " left on stack)");
	}

}
