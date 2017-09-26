package Chapter2_1;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class Exercise_17 {

	public static void InsertSort(Double[] a)
	{
		
	}
	public static void SelectSort(Double[] a)
	{
		
	}
	public static void DrawSort(Double[] a)
	{
		int N = a.length;
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		for (int i = 0; i < a.length; i++) {
			StdDraw.filledRectangle((0.5 / N) + 1.0 * i / N, a[i] / 2.0, 0.5 / N, a[i] / 2.0);
		}
		StdDraw.show(500);
		StdDraw.clear();
	}
	public static void main(String[] args)
	{
		Double[] a  = new Double[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = StdRandom.uniform();
		}
		
	}

}
