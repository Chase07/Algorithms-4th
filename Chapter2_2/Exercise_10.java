package Chapter2_2;

public class Exercise_10 {

	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		int rh = lo, lh = mid + 1;
		for (int i = 0; i <= mid; i++) {
			aux[i] = a[i];
		}
		for (int i = hi; i >= mid + 1; i--) {
			aux[i] = a[i];
		}
		for (int i = 0; i <= hi; i++) {
			if(less(a[rh], a[lh])) { a[i] = aux[rh++]; }
			else                   { a[i] = aux[lh++]; }
			
		}
		
	}
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
}
