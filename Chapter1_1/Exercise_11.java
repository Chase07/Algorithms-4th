package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_11 {

	public static void printBooleanMatrix(boolean[][] BoolMatrix)
	{
		System.out.print(' ');
		for (int i = 0; i < BoolMatrix[0].length; i++) {
			System.out.print(i);
			System.out.print(' ');
		}
		System.out.println();
		for (int i = 0; i < BoolMatrix.length; i++) {
			System.out.print(i);
			for (int j = 0; j < BoolMatrix[i].length; j++) {
				System.out.print((BoolMatrix[i][j] ? '+' : '-'));
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		boolean[][] BoolMatrix = new boolean[2][3];
		for (int i = 0; i < BoolMatrix.length; i++) {
			for (int j = 0; j < BoolMatrix[i].length; j++) {
				
				BoolMatrix[i][j] = StdIn.readInt() == 0 ? false : true;
			}
		}
		printBooleanMatrix(BoolMatrix);
	}
}
