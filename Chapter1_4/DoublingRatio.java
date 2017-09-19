package Chapter1_4;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class DoublingRatio {

	public static double timeTrial(int N)
	{
		int Max = 1000000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform(-Max, Max);
		}
		Stopwatch timer = new Stopwatch();
		int cnt = ThreeSumFast.count(a);
		return timer.elapsedTime();
	}
	public static void main(String[] args)
	{
		double  prev = timeTrial(125);
		for (int i = 250; true; i += i) {
			double time = timeTrial(i);
			StdOut.printf("%6d %7.1f, %7.1f", i, time, prev);
			
			StdOut.printf("%5.1f\n", time / prev);
			prev = time;
		}
	}
//Result£º
//	   250     0.0,     0.0  NaN
//	   500     0.0,     0.0  NaN
//	  1000     0.0,     0.0  NaN
//	  2000     0.0,     0.0  NaN
//	  4000     0.0,     0.0  NaN
//	  8000     1.0,     0.0Infinity
//	 16000     7.0,     1.0  7.0
//	 32000    30.0,     7.0  4.3
//	 64000   130.0,    30.0  4.3
//	128000   519.0,   130.0  4.0
//	256000  2200.0,   519.0  4.2
//	512000  9010.0,  2200.0  4.1
}
