package Chapter2_1;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class Exercise_18 {

	public static void main(String[] args) {
		Double[] a  = new Double[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = StdRandom.uniform();
		}
		int N = a.length;
		StdDraw.setXscale();
		StdDraw.setYscale();
		StdDraw.setPenColor(Color.BLACK);
		while(true)
		{
			for (int i = 0; i < a.length; i++) {
				a[i] = StdRandom.uniform();
			}
			for (int i = 0; i < a.length; i++) {
				StdDraw.filledRectangle((0.5 / N) + 1.0 * i / N, a[i] / 2.0, 0.5 / N, a[i] / 2.0);
			}
			StdDraw.show(1000);
			StdDraw.clear();
		}
		
	}

}
