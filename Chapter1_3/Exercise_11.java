package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_11 {

	public static double calculatePostfix(char[] expression)
	{
		Stack<Double> stack  = new Stack<Double>();
		double operand1, operand2, result;
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
					stack.push(Double.parseDouble(Character.toString(expression[i])));
					//stack.push(Double.parseDouble(expression[i] + ""));
					break;
				}
				case '+':
				{
					if(stack.size() >= 2)
					{
						operand1 = stack.pop();
						operand2 = stack.pop();
						result = operand1 + operand2;
						stack.push(result);
						break;
					}
				}
				case '-':
				{
					if(stack.size() >= 2)
					{
						operand1 = stack.pop();
						operand2 = stack.pop();
						result = operand1 - operand2;
						stack.push(result);
						break;
					}
				}
				case '*':
				{
					if(stack.size() >= 2)
					{
						operand1 = stack.pop();
						operand2 = stack.pop();
						result = operand1 * operand2;
						stack.push(result);
						break;
					}
				}
				case '/':
				{
					if(stack.size() >= 2)
					{
						operand1 = stack.pop();
						operand2 = stack.pop();
						result = operand1 / operand2;
						stack.push(result);
					}
					break;
				}
			}
		}
		return stack.pop();
		
	}
	public static void main(String[] args) {
		String data = StdIn.readString();
		char[] expression = data.toCharArray();
//		Exercise_10.InfixToPostfix(expression);
//		data = StdIn.readString();
		System.out.println(calculatePostfix(expression));
	}

}
