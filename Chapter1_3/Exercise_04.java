package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_04 {

	public static void checkMatch(char[] symbols)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < symbols.length; i++) 
		{
			switch(symbols[i])
			{
				case '(':
				case '[':
				case '{':
				{
					stack.push(symbols[i]);
					break;
				}
			
				case ')':
				{
					if(!stack.isEmpty() && stack.Top() == '(')
					{
						stack.pop();
					}
					break;
				}
				case ']':
				{
					if(!stack.isEmpty() && stack.Top() == '[')
					{
						stack.pop();
					}
					break;
				}
				case '}':
				{
					if(!stack.isEmpty() && stack.Top() == '{')
					{
						stack.pop();
					}
					break;
				}
			}
		}
		System.out.println(stack.isEmpty());
		
	}
	public static void main(String[] args) 
	{
		while(!StdIn.isEmpty())
		{
			String data = StdIn.readString();			
			char[] symbols = data.toCharArray();
			checkMatch(symbols);
		}
		System.out.println( "Check is over!");
	}

}
