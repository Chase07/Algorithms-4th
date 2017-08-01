package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_13 {

	public static void printTransposedMatrix(int[][] Matrix)
	{
		// j is column, i is row
		for (int i = 0; i < Matrix[0].length; i++) {
			// Print the column number of row
			for (int j = 0; j < Matrix.length; j++) {
				// Printf the row number of column
				System.out.printf("%-5d", Matrix[j][i]);
				
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		int[][] IntMatrix = new int[2][3];
		for (int i = 0; i < IntMatrix.length; i++) {
			for (int j = 0; j < IntMatrix[i].length; j++) {
				
				IntMatrix[i][j] = StdIn.readInt();
			}
		}
		printTransposedMatrix(IntMatrix);
	}
}
