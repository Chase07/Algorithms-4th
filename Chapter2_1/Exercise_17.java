package Chapter2_1;

import java.awt.Color;

import Chapter1_4.Stopwatch;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class Exercise_17 {

	public static void ShellSort(Double[] a)
	{
		int N = a.length;
		int h = 1;
		while(h < N / 3) { h = h * 3 + 1; }
		while(h >= 1)
		{
			for(int i = h; i < N; i++)
			{
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h){
					exch(a, j, j - h);
				}
				DrawSort(a);
			}
			h /= 3;
		}
	
	}
	public static void InsertSort(Double[] a)
	{
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && less(a[j], a[j - 1]) ; j--) {
				exch(a, j, j - 1);
				
			}
			DrawSort(a);
		}
	}
	public static void SelectSort(Double[] a)
	{
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				if(less(a[j], a[min])) { min = j; }
			}
			exch(a, i, min);
			DrawSort(a);
		}
	}
	public static boolean less(Double v, Double w)
	{
		return v - w < 0;
	}
	public static void exch(Double[] a, int i, int j)
	{
		Double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	} 
	public static void DrawSort(Double[] a)
	{
		int N = a.length;
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		for (int i = 0; i < a.length; i++) {
			StdDraw.filledRectangle((0.5 / N) + 1.0 * i / N, a[i] / 2.0, 0.5 / N, a[i] / 2.0);
		}
		StdDraw.show(50);
		StdDraw.clear();
	}
	public static void main(String[] args)
	{
		Double[] a  = new Double[1000];
		for (int i = 0; i < a.length; i++) {
			a[i] = StdRandom.uniform();
		}
		Stopwatch timer = new Stopwatch();
		ShellSort(a);
		//InsertSort(a);
		//SelectSort(a);
		System.out.println("timer = " + timer.elapsedTime() + "seconds!");
	}

}
