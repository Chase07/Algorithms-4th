package Chapter1_3;

import java.util.Iterator;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Stack<Item> implements Iterable<Item>
{
	private Node first;
	private int size;
	private class Node
	{
		Item item;
		Node next;
	}
	
	public boolean isEmpty() { return first == null; }
	public int size() { return size; }
	public void push(Item item)
	{
		//This is a stack(LIFO)
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		++size;
	}
	public Item pop()
	{
		Item temp = first.item;
		first = first.next;
		--size;
		return temp;
	}
	//Iterator
	public Iterator<Item> iterator()
	{
		return new ListIterator(); 
	}
	public class ListIterator implements Iterator<Item>
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
