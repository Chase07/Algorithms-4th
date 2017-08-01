package Chapter1_1;
import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class BinarySearch {

	public static int rank(int key, int[] a)
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
		@SuppressWarnings("deprecation")
		int[] whiteList = In.readInts(args[0]);// Set the first command-line argument as "scr/Chapter1_1/Whitelist.txt"
		Arrays.sort(whiteList);
		while(! StdIn.isEmpty())
		{
			// Read key, print if not in whiteList
			int key = StdIn.readInt();
			if(rank(key, whiteList) < 0)
			{
				StdOut.println(key);
			}
			
		}
		
	}
}
