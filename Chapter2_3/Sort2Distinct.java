package Chapter2_3;

public class Sort2Distinct {

	public static void sort(Comparable[] a)
	{
		int lt = 0, rt = a.length - 1, cur = 0;
		while(cur <= rt)
		{
			if(less(a[lt], a[cur])) { exch(a, cur, rt--); }
			else if(less(a[cur], a[lt])) { exch(a, cur++, lt++); }
			else { cur++; }
		}
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
