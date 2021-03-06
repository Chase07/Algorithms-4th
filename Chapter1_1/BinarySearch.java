package Chapter1_1;
import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import Chapter1_1.Exercise_29;
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
		
		int[] whiteList = In.readInts(args[0]);// Set the first command-line argument as "scr/Chapter1_1/Whitelist.txt"
		Arrays.sort(whiteList);
		while(! StdIn.isEmpty())
		{
			// Read key, print if not in whiteList
			
			int key = StdIn.readInt();
			//int result = rank(key, whiteList);
			//StdOut.println(result != -1 ? "Position" + result + ": " + whiteList[result] : "No such number in whitelist");
			
			//int result = Exercise_29.rank(key, whiteList);// Test for Exercise_29
			int result = Exercise_29.count(key, whiteList);// Test for Exercise_29
			StdOut.println(result);// Test for Exercise_29
		}
		
	}
}
