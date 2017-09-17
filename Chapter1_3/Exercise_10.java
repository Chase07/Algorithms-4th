package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Exercise_10 {

	
	public static void InfixToPostfix(char[] expression)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length; i++) {
			switch(expression[i])
			{
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				{
					StdOut.print(expression[i]);
					break;
				}
				case '(':
				{
					stack.push(expression[i]);
					break;
				}
				case '+':
				case '-':
				case '*':
				case '/':
				{
					while(!stack.isEmpty() && priority(stack.Top()) >= priority(expression[i]))
					{
						StdOut.print(stack.pop());
					}
					stack.push(expression[i]);
					break;
				}
				case ')':
				{
					if(!stack.isEmpty())
					{
						while(stack.Top() != '(')
						{
							StdOut.print(stack.pop());
						}
						stack.pop();	
					}
					else
					{
						throw new RuntimeException("The expression is wrong!");
					}
				}
				
			}
		}
		while(!stack.isEmpty() && stack.Top() != '(')
		{
			StdOut.print(stack.pop());
		}
	}
	private static int priority(char operator)
	{
		if(operator == '+' || operator == '-')
		{
			return 1;
		}
		else if(operator == '*' || operator == '/')
		{
			return 2;
		}
		else if(operator == '(')
		{
			return 0;
		}
		else
			throw new RuntimeException("Error from priority:This is the wrong operator!");
		
	}
	public static void main(String[] args) 
	{
		String data = StdIn.readString();
		char[] expression = data.toCharArray();
		InfixToPostfix(expression);
	}

}
