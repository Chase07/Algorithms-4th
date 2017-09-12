package Chapter1_3;

import java.util.Iterator;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Bag<Item> implements Iterable<Item>
{
	private Node first;
	private class Node
	{
		Item item;
		Node next;
	}
	
	public void add(Item item)
	{
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}
	public Iterator<Item> iterator()
	{
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		public boolean hasNext() { return current != null; }
		public Item next() 
		{
			Item temp = current.item;
			current = current.next;
			return temp;
		}
		public void remove() {  }
		
	}
	public static void main(String[] args) 
	{
		Stack<String>  stack = new Stack<String>();
		while(!StdIn.isEmpty())
		{
			String temp = StdIn.readString();
			if(!temp.equals("-")) stack.push(temp);
			//else if(!stack.isEmpty()) StdOut.print(stack.pop() + " ");
		}
		//Test for iterable
		for(String str : stack)
		{
			StdOut.print(str + " ");
		}
		StdOut.println("(" + stack.size() + " left on stack)");
	}

}
