package Chapter1_4;

import java.util.Arrays;

import Chapter1_1.BinarySearch;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class ThreeSumFast {

	public static int count(int[] a)
	{
		Arrays.sort(a);//logN
		//int N = a.length;
		int count = 0;
		for(int i = 0; i < a.length; ++i)
		{
			for (int j = i + 1; j < a.length; j++) {
				if(BinarySearch.rank(-a[i] - a[j], a) > j)// Make sure the a[j] is different
				{
					++count;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] a = In.readInts("src/Chapter1_4/8Kints.txt");
		StdOut.print(count(a));
	}
}
