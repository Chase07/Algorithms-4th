package Chapter1_4;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class ThreeSum {

	public static int count(int[] a)
	{
		//int N = a.length;
		int cnt = 0;
		Stopwatch timer = new Stopwatch();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					if(a[i] + a[j] + a[k] == 0)
					{
						cnt++;
					}
				}
			}
		}
		//System.out.println(timer.elapsedTime() + "seconds");
		return cnt;
	}
	public static void main(String[] args) {
		int[] a = In.readInts("src/Chapter1_4/8Kints.txt");
		StdOut.print(count(a));
		
	}

}
