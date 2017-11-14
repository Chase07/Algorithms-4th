package Chapter2_4;

public class MaxPQ <Key extends Comparable<Key>> 
{
	private Key[] PQ; // Complete binary tree
	private int N = 0;
	
	public MaxPQ(int maxN)
	{
		PQ = ( Key[] ) new Comparable[maxN + 1];	
	}
	public boolean isEmpty()
	{ return N == 0; }
	public int size()
	{ return N; }
	public void insert(Key v)
	{
		PQ[++N] = v;
		swim(N);
	}
	public Key delMax()
	{
		Key max = PQ[1];
		exch(1, N--);
		PQ[N + 1] = null;
		sink(1);
		return max;
	}
	private boolean less(int i, int j)
	{ return PQ[i].compareTo(PQ[j]) < 0; }
	private void exch(int i, int j)
	{
		Key t = PQ[i];
		PQ[i] = PQ[j];
		PQ[j] = t;
	}
}
