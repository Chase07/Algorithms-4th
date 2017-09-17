package Chapter1_3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class Exercise_03 {

	public static void checkOrder(int[] popOrder)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int number = 0;
		int indexOfPopOrder = 0;
		while(indexOfPopOrder < popOrder.length && number <= popOrder.length) 
		{	
			if(!stack.isEmpty() && stack.Top() == popOrder[indexOfPopOrder])
			{
				StdOut.print(stack.pop() + " ");
				++indexOfPopOrder;
			}
			else if(number < popOrder.length)
			{
				stack.push(number++);
				
			}
			else
			{
				//we can't pop the number as the popOrder and push anything
				break;
			}
				
		}
		StdOut.println();
		
		StdOut.print((number == indexOfPopOrder && stack.isEmpty()) + ", Stack status: ");
		for(int i : stack)
		{
			StdOut.print(i + " ");
		}
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(Paths.get("src/Chapter1_3/PopOrder.txt"));
		String[] data = new String[10];
		int[] popOrder = new int[10];
		for (int i = 0; i < 8; i++) 
		{
			data = input.nextLine().split(" ");// Read each line of the popOrder as strings 
			for (int j = 0; j < data.length; j++) 
			{
				popOrder[j] = Integer.parseInt(data[j]);
			}
			checkOrder(popOrder);
			System.out.println();
		}	
	}

}
