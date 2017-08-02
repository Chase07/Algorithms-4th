package Chapter1_1;

public class Exercise_20 {

	public static double ln(int N)
	{
		if(N == 1) return .0;
		else return ln(N - 1) + Math.log(N);
		
	}
	
	public static void main(String args[])
	{
		System.out.println(ln(2));
		
	}
}
