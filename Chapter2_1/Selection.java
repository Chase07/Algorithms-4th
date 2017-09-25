package Chapter2_1;

public class Selection {

	public static void sort(Comparable[] a)
	{   // Sort a[] into increasing order
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;// index of minimal element
			for (int j = i + 1; j < N; j++) {
				if(less(a[j], a[min])) { min = j; }
				exch(a, i, min);
			}
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
		for (int i = 0; i < a.length; i++) {
			if(less(a[i], a[i - 1])) { return false; }
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
