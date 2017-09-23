package Chapter1_3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise_13 {

	public static void isMatch(int[] order)
	{
		if(order[0] != 0) { System.out.println("false"); }
		else
		{
			for(int i : order)
				System.out.print(i + " ");
			
			System.out.println("\ntrue"); 
		}
		
	}
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(Paths.get("src/Chapter1_3/DequeueOrder.txt"));
		
		String[] data;
		int[] order = new int[10];
		while(in.hasNextLine())
		{
			data = in.nextLine().split(" ");
			for (int i = 0; i < order.length; i++) {
				order[i] = Integer.parseInt(data[i]);
			}
			isMatch(order);
			
		}

	}

}
