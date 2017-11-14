package Chapter2_2;

public class Merge {

	//private static int counter = 0;// for test
	public static void sort(Comparable[] a)
	{
		
		Comparable[] aux = a.clone();//Deep copy
		sort(aux, a, 0, a.length - 1);
	}
	private static void sort(Comparable[] src, Comparable[] aux, int lo, int hi)
	{
		if(hi - lo < 15)// Exercise_11
		{
			InsertionSort(aux, lo, hi);
			return ;
		}
		int mid = lo + (hi - lo) / 2;
		sort(aux, src, lo, mid);
		sort(aux, src, mid + 1, hi);
		if(!less (src[mid], src[mid + 1])){// Exercise_11
			merge(src, aux, lo, mid, hi);
		}
		
	}
	private static void merge(Comparable[] src, Comparable[] aux, int lo, int mid, int hi)
	{
		int i = lo, j = mid + 1;
		/*System.out.print("IN:");
		for (int j2 = lo; j2 <= hi; j2++) {
			System.out.print(a[j2] + " ");
		}
		System.out.println();*/
		
		for (int k = lo; k <= hi; k++) {// merge back to a[lo..hi]
			if		(i > mid) 				 { aux[k] = src[j++]; }
			else if (j > hi) 				 { aux[k] = src[i++]; }
			else if (less(src[j], src[i]))   {/*System.out.println(i + " VS " + j + " counter:" + ++counter); */aux[k] = src[j++]; }
			else			  				 {/*System.out.println(i + " VS " + j + " counter:" + ++counter); */aux[k] = src[i++]; }
		}
		/*System.out.print("OUT:");
		for (int j2 = lo; j2 <= hi; j2++) {
			System.out.print(a[j2] + " ");
		}
		System.out.println();*/
	}
	private static void InsertionSort(Comparable[] a, int lo, int hi)//Exercise_11
	{
		for (int i = lo; i <= hi; i++)
		{
			for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	public static void main(String[] args) {
		Integer[] test = new Integer[30];
		for (int i = 0; i < 30; i++) {
			test[29 - i] = i;
		}
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		sort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		//System.out.println("\n" +counter);
	}

}
