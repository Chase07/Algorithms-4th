package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_30 {

	public static boolean isCoprime(int p, int q)
	{
		if(p == 0 || q == 0)
		{
			return false;
		}
		if(p > q && p % q != 0)
		{
			return isCoprime(q, p % q);
		}else
		if(p < q && q % p != 0)
		{
			return isCoprime(p, q % p);
		}
		return (p > q && q == 1) ? true : false;
		
	}
	public static void main(String[] args) {
		
		int N = StdIn.readInt(); 
		boolean[][] a = new boolean [N][N];
		System.out.print("  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "	");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = isCoprime(i, j);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
