package Chapter1_1;

public class Exercise_24 {

	public static int Euclid(int p, int q)
	{
		if(p == 0 || q == 0)
		{
			System.out.println("There is no Greatest Common Divisor!");
			System.exit(-1);
		}
		System.out.println(p + " " + q);
		if(p > q && p % q != 0)
		{
			return Euclid(q, p % q);
		}else
		if(p < q && q % p != 0)
		{
			return Euclid(p, q % p);
		}
		return p > q ? q : p;
		
	}
	public static void main(String[] args) 
	{
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		
		System.out.println(Euclid(p, q));

	}

}
