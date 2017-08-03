package Chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Exercise_28 {
	public static int binarySearch(int key, int[] a)
	{
		// Array must be sorted
		int lo = 0;
		int hi = a.length - 1;
		
		while(lo <= hi)
		{   //Key is in a[lo..hi] or not present
			int mid = lo + (hi - lo) / 2;
			if      (key < a[mid]) {hi = mid - 1;}
			else if (key > a[mid]) {lo = mid + 1;}
			else return mid;
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		
		int[] whiteList = In.readInts(args[0]);// Set the first command-line argument as "scr/Chapter1_1/Whitelist.txt"
		Arrays.sort(whiteList);
		ArrayList<Integer> List = new ArrayList<>();
		for (int i = 0; i < whiteList.length - 1; i++) 
		{
			if(whiteList[i] != whiteList[i + 1])
			{
				List.add(whiteList[i]);
			}
			
		}
		List.add(whiteList[whiteList.length - 1]);
		StdOut.print(List);
		
		while(! StdIn.isEmpty())
		{
			// Read key, print if not in whiteList
			int key = StdIn.readInt();
			if(binarySearch(key, whiteList) < 0)
			{
				StdOut.println(key);
			}
			
		}
		
	}

}
