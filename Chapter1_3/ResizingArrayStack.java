package Chapter1_3;

import java.util.Iterator;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class ResizingArrayStack<Item> implements Iterable<Item> {

	private Item[] box = (Item[]) new Object[1];
	private int size = 0;
	
	public boolean isEmpty(){ return size == 0; }
	public int size(){ return size; }
	private void resize(int newBoxSize)
	{
		//The newBoxSize must bigger than size
		Item[] temp = (Item[]) new Object[newBoxSize];
		for (int i = 0; i < size; i++) {
			temp[i] = box[i];
		}
		//Make the box refer to temp
		box = temp;
 	}
	public void push(Item item)
	{
		if(size == box.length) { resize(2 * box.length); }
		box[size++] = item;
	}
	public Item pop()
	{
		Item item = box[--size];
		box[size] = null;
		if(0 <= size && size == box.length / 4) { resize(box.length / 2); }
		return item;
	}
	
	//
	private class ReverseArrayIterator implements Iterator<Item>
	{
		private int s = size;
		public boolean hasNext() { return s > 0; }
		public Item next() { return box[--s]; }
		public void remove() {  }
	}
	public Iterator<Item> iterator()
	{
		return new ReverseArrayIterator();
	}
	
	public static void main(String[] args) 
	{
		ResizingArrayStack<String> str = new ResizingArrayStack();
		while(!StdIn.isEmpty())
		{
			String temp = StdIn.readString();
			if(!temp.equals("-")) str.push(temp);
			//else if(!str.isEmpty()) StdOut.print(str.pop() + " ");
			
		}
		//Teat for its iterable
		  //1.
		/*for(String s : str)
		{
			StdOut.print(s + " ");
		}*/
		  //2.
		Iterator<String> iter = str.iterator();
		while(iter.hasNext())
		{
			StdOut.print(iter.next() + " ");
		}
		StdOut.println();
		StdOut.println("(" + str.size() + " left on stack)");
	}
}
