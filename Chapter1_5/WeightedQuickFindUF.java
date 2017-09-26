package Chapter1_5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;
import Chapter1_4.Stopwatch;


public class WeightedQuickFindUF {

	private int[] id;
	private int[] sz;// size of component for roots
	private int count;// number of components
	public WeightedQuickFindUF(int N)
	{
		count = N;
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
		sz = new int[N];
		for (int i = 0; i < sz.length; i++) {
			sz[i] = 1;
		}
		
	}
	public int count() { return count; }
	public boolean connected(int p, int q)
	{
		return find(p) == find(q);
	}
	public int find(int p)
	{
		while(p != id[p]) { p = id[p]; }
		return p;
	}
	public void union(int p, int q)
	{
		int pRoot = find(p);
		int qRoot = find(q);
		
		if(pRoot == qRoot) { return; }
		if(sz[pRoot] < sz[qRoot]) 
		{ 
			id[pRoot] = qRoot; 
			sz[q] += sz[p]; 
		}else
		{
			id[qRoot] = pRoot;
			sz[p] += sz[q]; 
		}
		--count;
	}

	public static void main(String[] args) throws IOException 
	{
		// Dynamic connectivity problem
		Scanner in = new Scanner(Paths.get("src/Chapter1_5/tinyUF.txt"));
		int N = in.nextInt();
		System.out.println(N);
		WeightedQuickFindUF uf = new WeightedQuickFindUF(N);
		Stopwatch timer = new Stopwatch();
		while(in.hasNext())
		{
			int p = in.nextInt();
			int q = in.nextInt();
			if(uf.connected(p, q)) { continue; }
			uf.union(p, q);
			StdOut.println(p + " joint " + q);
			
		}
		System.out.println(timer.elapsedTime() + " seconds");
		StdOut.println(uf.count() + " components");
	}
}
/*largeUF.txt        mediumUF.txt      tinyUF.txt
 * N = 1000000        N = 625			N = 10
 * 20.329 seconds    0.054 seconds     0.0 seconds
 * 6 components		  3 components   	2 components
 * */
 