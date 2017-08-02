package Chapter1_1;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_21 {

	public static void main(String[] args) {
		System.out.println("PLZ input the amount of data:");
		int amount = StdIn.readInt();
		
		String[] name = new String[amount];
		int[] number1 = new int[amount]; 
		int[] number2 = new int[amount];
		for (int i = 0; i < amount; i++) 
		{
			name[i] = StdIn.readString();
			number1[i] = StdIn.readInt();
			number2[i] = StdIn.readInt();
		
		}
		System.out.println("Name--num1--num2--result");
		for (int i = 0; i < amount; i++) 
		{
			/*
			System.out.printf("|%-4s|", name[i]);
			System.out.print(""number1[i]);
			System.out.printf("%-8d", number2[i]);
			System.out.printf("%-8d", number1[i] / number2[i]);
			System.out.println();*/
			System.out.printf("|%-8s|%-8d|%-8d|%-8.3f|\n", name[i], number1[i], number2[i], (double)(number1[i] / number2[i]));
		}
		
	}

}
