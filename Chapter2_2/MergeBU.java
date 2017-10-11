package Chapter2_2;

public class MergeBU {

	public static void sort(Comparable[] a)
	{
		int size = a.length;
		Comparable[] aux = new Comparable[size];
		for(int subSize = 1; subSize < size; subSize += subSize) 
		{// merge the length of subSize of subarray each loop
			for(int lo = 0; lo < size - subSize; lo += (subSize + subSize))
			{
				merge(a, aux, lo, lo + subSize -1, Math.min(lo  + (subSize - 1) + subSize, size - 1));
			}
		}
		
	}
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		aux = new Comparable[a.length];
		int i = lo, j = mid + 1;
		for (int k = 0; k <= hi; k++) {
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if     (i > mid)       		  { a[k] = aux[j++]; }
			else if(j > hi)  			  { a[k] = aux[i++]; }
			else if(less(aux[i], aux[j])) { a[k] = aux[i++]; }
			else						  { a[k] = aux[j++]; }
		
		}
	}
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	public static void exch(Comparable[] a, int i, int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void show(Comparable[] a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] + " ");
		}
		System.out.println();
	}
	public static boolean isSorted(Comparable[] a)
	{
		for (int i = 1; i < a.length; i++) {
			if(less(a[i], a[i - 1])) { return false; }
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
