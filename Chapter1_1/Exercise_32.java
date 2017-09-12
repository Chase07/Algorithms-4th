package Chapter1_1;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdStats;

public class Exercise_32 {

	public static void drawHistogram(int N, double l, double r, double[] data)
	{
		int list[] = new int[N];
		double step = (r - l) / N;//The width of each vertical bar
		System.out.println("step:" + step);
		for (int i = 0; i < data.length; i++) 
		{
			int index = getIndex(data[i], N, l, r, step);
			if(index >= 0)
			{
				list[index]++;
			}
			
		}
		int max = StdStats.max(list);
		//StdDraw.setCanvasSize(960, 1080);
		//StdDraw.setXscale(l, r);
		//StdDraw.setYscale(0, max);
		System.out.println("max:" + max);
		for (int i = 0; i < list.length; i++) 
		{
			double x = (0.5 / N) + (1.0 * i / N),
				   y = list[i] / (max * 2.0),//"(list[i] / max) / 2.0" is same as "list[i] / (max * 2.0)", but the former expression has zero anwser
				   rw = 0.5 / N,
				   rh = list[i] / (max * 2.0);
				
			
			/*double x = l + (i + 0.5) * step,
				   y = list[i] / 2.0,
				   rw = 0.5 * step,
				   rh = list[i] / 2.0;*/
			
			System.out.println(x + " " + y + " " + rw + " " + rh);
			StdDraw.filledRectangle(x, y, rw, rh);
			
		}
	}
	public static int getIndex(double decimal, int N, double l, double r, double step)
	{
		
		if(l <= decimal && decimal <= r)
		{
			return (int)((decimal - l) / step);
		}
		else
			return -1; 
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);//5
		double l = Double.parseDouble(args[1]),//5.0 
			   r = Double.parseDouble(args[2]);//10.0
		double data[] = In.readDoubles("src/Chapter1_1/DoubleList.txt");
		drawHistogram(N, l, r, data);
		
	}

}
