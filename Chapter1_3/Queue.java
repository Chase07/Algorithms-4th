package Chapter1_3;

import java.util.Iterator;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Queue<Item> implements Iterable<Item>
{
	private Node first;
	private Node last;
	private int size;
	private class Node
	{
		Item item;
		Node next;
	}
	
	public boolean isEmpty() { return first == null; }
	public int size() { return size; } 
	public void Enqueue(Item item)
	{
		//This is a queue(FIFO)
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) { first = last; }
		else { oldLast.next = last; }
		++size;
		
	}
	public Item Dequeue()
	{
		Item temp = first.item;
		first = first.next;
		if(isEmpty()) { last = null; }
		--size;
		return temp;
	}
	public Item Head()
	{
		if(isEmpty()) { throw new RuntimeException("This queue is empty!"); }
		return first.item;
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
	public static void main(String[] args) {
		Queue<String>  queue = new Queue<String>();
		while(!StdIn.isEmpty())
		{
			String temp = StdIn.readString();
			if(!temp.equals("-")) queue.Enqueue(temp);
			//else if(!queue.isEmpty()) StdOut.print(queue.Dequeue() + " ");
		}
		//Test for iterable
		for(String str : queue)
		{
			StdOut.print(str + " ");
		}
		StdOut.println("(" + queue.size() + " left on queue)");
	}

}
