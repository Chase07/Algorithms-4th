package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_23 {

	public static int BinarySearch(int key, int[] a)
	{
		return BinarySearch(key, a, 0, a.length - 1);
	}
	public static int BinarySearch(int key, int[] a, int lo, int hi)
	{
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if(key > a[mid])
		{
			return BinarySearch(key, a, mid + 1, hi); 
		}else 
		if(key < a[mid])
		{
			return BinarySearch(key, a, lo, mid - 1);
		}
		else return a[mid];
		
	}
	public static void main(String[] args) 
	{
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("PLZ input the + or -:");
		char sign = StdIn.readChar();
		System.out.println("PLX input keys:");
		StdIn.readLine();// Read the inutile return character
		String[] key = StdIn.readLine().split(" ");
		for (int i = 0; i < key.length; i++) 
		{
			if(sign == '+' && BinarySearch(Integer.parseInt(key[i]), a) != -1)
			{
				System.out.print(key[i] + " ");

			}else
			if(sign == '-' && BinarySearch(Integer.parseInt(key[i]), a) == -1)
			{
				System.out.print(key[i] + " ");

			}
	
		}
		
	}

}
