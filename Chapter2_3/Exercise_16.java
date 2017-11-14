package Chapter2_3;

public class Exercise_16 {

	
	public static Integer[] best(int N)
	{
		Integer[] a = new Integer[N];
		for(int i = 0; i < N; ++i)
		{
			a[i] = i;
		}
		best(a, 0, N -1);
		return a;
	}
	private static void best(Integer[] a, int lo, int hi)
	{
		// a[lo...hi] contains keys lo to hi must in order
		for(int i = lo; i <= hi; ++i)
		{
			assert a[i] == i;
		}
		if(lo >= hi) { return; }
		int mid = lo + (hi - lo) / 2;// Significant partition in half !
		best(a, lo, mid - 1);
		best(a, mid + 1, hi);
		exch(a, lo, mid);
		
	}
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) 
	{	
		Integer[] a = best(6);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}//2 1 0 4 3 5
		System.out.println();
	}

}
