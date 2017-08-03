package Chapter1_1;

import java.sql.ResultSetMetaData;

public class Exercise_27 
{
	private static long counter = 0;
	private static double[][] resultMatrix; 
	
	public static double binomial(int N, int k, double p)
	{
		resultMatrix = new double[N + 1][k + 1];
		for (int i = 0; i <= N; i++) 
		{
			for (int j = 0; j <= k; j++) 
			{
				resultMatrix[i][j] = -1;
			}
		}
		
		return binomialCompute(N, k, p);
	}
	public static double binomialCompute(int N, int k, double p)
	{
		
		if(N == 0 && k == 0)
		{
			return 1.0;
		}
		if(N < 0 || k < 0)
		{
			return 0.0;
		}
		if(resultMatrix[N][k] == -1)
		{
			counter++;
			resultMatrix[N][k] = (1.0 - p) * binomialCompute(N - 1, k, p) + p * binomialCompute(N - 1, k -1, p);
		}
		return resultMatrix[N][k];
	
	}
	public static void main(String[] args) 
	{
		
		System.out.println(binomial(100, 50, 0.25) + " " + counter);
	}
}
