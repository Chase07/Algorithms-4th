package Chapter1_1;

public class Exercise_29 {

	
	public static int rank(int key, int array[])
	{
		int lo = 0;
		int hi = array.length - 1;
		int mid = lo + (hi - lo) / 2;
		while (lo <= hi) 
		{
			mid = lo + (hi - lo) / 2;
			if(array[mid] < key)
			{
				lo = mid + 1;	
			}else
			if(key < array[mid])
			{
				hi = mid - 1;
			}	
			else if(key == array[mid])
			{
				// Just because binary sort is an unstable sort
				while(--mid >= 0 && array[mid] == array[mid + 1]);
				return mid + 1;
			}
		}
		if(key < array[mid]) return mid;
		else return mid + 1;
	}
	public static int count(int key, int[] a)
    {
        int counter = 0;
        for (int i = rank(key, a); i < a.length && a[i] == key; i++){ counter++; }
            
        return counter;
    }

}
