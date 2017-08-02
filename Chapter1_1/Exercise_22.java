package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_22 {

	public static int BinarySearch(int key, int[] a)
	{
		return BinarySearch(key, a, 0, a.length - 1, 0);
	}
	public static int BinarySearch(int key, int[] a, int lo, int hi, int depth)
	{
		for (int i = 0; i < depth; i++) {
			System.out.print("	");
		}
		System.out.println(lo + " " +  hi);
		
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if(key > a[mid])
		{
			return BinarySearch(key, a, mid + 1, hi, depth + 1); 
		}else 
		if(key < a[mid])
		{
			return BinarySearch(key, a, lo, mid - 1, depth + 1);
		}
		else return a[mid];
		
	}
	public static void main(String[] args) 
	{
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = StdIn.readInt();
		System.out.println(BinarySearch(key, a) != -1 ? key : "No such a number");
		
		
	}

}
