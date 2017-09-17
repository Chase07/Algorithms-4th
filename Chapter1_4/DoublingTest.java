package Chapter1_4;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class DoublingTest {

	public static double timerTrial(int N)
	{
		int Max = 1000000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) 
		{
			a[i] = StdRandom.uniform(-Max, Max);
		}
		Stopwatch timer = new Stopwatch();
		int cnt = ThreeSum.count(a);
		return timer.elapsedTime();
	}
	public static void main(String[] args) {
		for (int i = 250; true; i += i) 
		{
			StdOut.printf("%7d %5.1f seconds\n", i, timerTrial(i));
		}

	}

}
