package Chapter1_3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ResizingArrayQueueOfStrings {

	private String[] str;
	private int size = 0;
	private int head = 0;// Always point to the first elem or the first position of the str.
	private int rear = 0;// Always point to the first position behind the last elem.
	
	public ResizingArrayQueueOfStrings()
	{
		str = new String[1];
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public int size()
	{
		return size;
	}
	private void resize(int length)
	{
		String[] temp = new String[length];
		for (int i = 0; i < size; i++) {
			temp[i] = str[(head + i) % str.length];
		}
		str = temp;
		head = 0;
		rear = size;
	}
	public void Enqueue (String elem)
	{
		if(size == str.length)
		{
			resize(2 * str.length);
		}
		str[rear++] = elem;
		if(rear == str.length)
		{
			// wrap around
			rear = 0;
		}
		++size;
		
	}
	public String Dequeue()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Error from ResizingArrayQueueOfStrings:This is a empty queue!");
		}
		String temp = str[head];
		str[head] = null;// Avoid loitering
		++head;
		--size;
		if(head == str.length) 
		{
			head = 0;
		}
		if(size > 0 && size == str.length / 4)
		{
			resize(str.length / 2);
		}
		return temp;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(Paths.get("src/Chapter1_3/Strings.txt"));
		ResizingArrayQueueOfStrings RAQS = new ResizingArrayQueueOfStrings();
		for(int i = 0; i < 6; ++i)
		{
			RAQS.Enqueue(input.next());
		}
		for(int i = 0; i < 3; ++i)
		{
			System.out.print(RAQS.Dequeue() + " ");
		}
		System.out.println();
		for(int i = 0; i < 4; ++i)
		{
			RAQS.Enqueue(input.next());
		}
		while(!RAQS.isEmpty())
		{
			System.out.print(RAQS.Dequeue() + "@");
		}
	}

}
