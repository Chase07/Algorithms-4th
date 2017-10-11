package Chapter2_2;

public class Merge {

	//private static int counter = 0;// for test
	public static void sort(Comparable[] a)
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	{
		if(hi <= lo) return ;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		int i = lo, j = mid + 1;
		/*System.out.print("IN:");
		for (int j2 = lo; j2 <= hi; j2++) {
			System.out.print(a[j2] + " ");
		}
		System.out.println();*/
		for (int k = lo; k <= hi; k++) {// Copy a[lo..hi] to aux[lo..hi]
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {// merge back to a[lo..hi]
			if		(i > mid) 				 { a[k] = aux[j++]; }
			else if (j > hi) 				 { a[k] = aux[i++]; }
			else if (less(aux[j], aux[i]))   {/*System.out.println(i + " VS " + j + " counter:" + ++counter); */a[k] = aux[j++]; }
			else			  				 {/*System.out.println(i + " VS " + j + " counter:" + ++counter); */a[k] = aux[i++]; }
		}
		/*System.out.print("OUT:");
		for (int j2 = lo; j2 <= hi; j2++) {
			System.out.print(a[j2] + " ");
		}
		System.out.println();*/
	}
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	public static void main(String[] args) {
		Integer[] test = {8, 4, 6, 7};
		sort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		//System.out.println("\n" +counter);
	}

}
