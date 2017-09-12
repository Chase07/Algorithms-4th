package Chapter1_1;


import javax.swing.GrayFilter;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdRandom;

public class Exercise_31 {

	public static class Point
	{
		double x;
		double y;
		
		public Point(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
	}
	public static void drawRandom(int N, double p)
	{
		StdDraw.circle(0.5, 0.5, 0.5);
		StdDraw.setPenRadius(0.05);
		double angle = 360.0 / N;
		Point[] points = new Point[N];
		
		for (int i = 0; i < points.length; i++) 
		{
			points[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180),
					0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
			 
			StdDraw.point(points[i].x, points[i].y);
		}
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.GRAY);
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = 1; j < points.length; j++) {
				if(StdRandom.bernoulli(p))
				{
					StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("PLZ input an integer:");
		int N = StdIn.readInt();
		double p;	
		do 
		{
			System.out.println("PLZ input an decimal between 0 and 1:");
			p = StdIn.readDouble();
		}while( p >= 1);
		drawRandom(N, p);
		
	}
	
	

}
