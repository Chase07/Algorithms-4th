package Chapter1_3;

import edu.princeton.cs.introcs.StdIn;

public class Exercise_37 {

	public static void main(String[] args) {
		int N = StdIn.readInt();
		int M = StdIn.readInt();
		int knife = 1;
		boolean switchToalive1 = true;
		Queue<Integer> alive1 = new Queue<Integer>();
		Queue<Integer> alive2 = new Queue<Integer>();
		for (int i = 0; i < N; i++) {
			alive1.Enqueue(i); 
		}
		
		while(!alive1.isEmpty() || !alive2.isEmpty())
		{
			if(switchToalive1 && knife != M)
			{
				alive2.Enqueue(alive1.Dequeue());
				++knife;
				switchToalive1 = alive1.isEmpty() ? false : switchToalive1;
			}
			else if(switchToalive1 && knife == M)
			{
				System.out.print(alive1.Dequeue() + " ");
				knife = 1;
				switchToalive1 = alive1.isEmpty() ? false : switchToalive1;
			}	
			else if(!switchToalive1 && knife != M)
			{
				alive1.Enqueue(alive2.Dequeue());
				++knife;
				switchToalive1 = alive2.isEmpty() ? true : switchToalive1;
			}
			
			else if(!switchToalive1 && knife == M)
			{
				System.out.print(alive2.Dequeue() + " ");
				knife = 1;
				switchToalive1 = alive2.isEmpty() ? true : switchToalive1;
			}
		}
	}

}
