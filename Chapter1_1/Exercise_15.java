package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_15 {

	
	public static int[] histogram(int a[], int M)
	{
		int[] array = new int[M];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] >= 0 && a[i] <= M - 1)
			{
				++array[a[i]];
			}
			 
		}
		return array;
	}
	public static void main(String[] args) 
	{
		int[] a = new int[StdIn.readInt()]; 
		for (int i = 0; i < a.length; i++) {
			a[i] = StdIn.readInt();
		}
		int[] result = histogram(a, a.length);
		for (int i = 0; i < result.length; i++) {
			System.out.print(i + ":");
			System.out.println(result[i]);
			
		}
		
	}

}
