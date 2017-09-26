package Chapter2_1;

import Chapter1_4.Stopwatch;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class SortCompare {

	public static double time(String alg, Double[] a)
	{
		Stopwatch timer = new Stopwatch();
		if(alg.equals("Selection")) { Selection.sort(a); }
		if(alg.equals("Insertion")) { Insertion.sort(a); }
		if(alg.equals("Shell")) { Shell.sort(a); }
		
		return timer.elapsedTime();
	}
	public static double timeRandomInput(String alg, int N, int T)
	{
		double totalTime = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) 
		{
			for (int i = 0; i < N; i++) 
			{
				a[i] = StdRandom.uniform();
			}
			totalTime += time(alg, a);
		}
		return totalTime;
	}
	public static void main(String[] args) {
		String alg1 = args[0];
		String alg2 = args[1];
		int N = Integer.parseInt(args[2]);// The length of array
		int T = Integer.parseInt(args[3]);// The account of arrays
		
		double t1 = timeRandomInput(alg1, N, T);
		double t2 = timeRandomInput(alg2, N, T);
		StdOut.printf("For %d random Doubles:\n", N);
		StdOut.printf("%s is %.1f times faster than %s\n", alg1, t2/t1, alg2);
		
	}

}
//For 100000 random Doubles:
//Shell is 592.8 times faster than Insertion