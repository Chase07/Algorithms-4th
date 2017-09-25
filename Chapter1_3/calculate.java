package Chapter1_3;

public class calculate {

	public static void main(String[] args) {
		double X = 6.0;
		double result;
		for (int i = 0; i < 10; i++, X = result) 
		{
			result = X - ((X * X * X - 8 * X * X + 8 * X - 4) / (3 * X * X - 16 * X + 8));
			System.out.println("X = " + i + ", result = " + result);
		}

	}

}
