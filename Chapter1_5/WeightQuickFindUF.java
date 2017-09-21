package Chapter1_5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Stopwatch;

public class WeightQuickFindUF {

	private int[] id;
	private int[] sz;// size of component for roots
	private int count;// number of components
	public WeightQuickFindUF(int N)
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
//	private int[] id;
//	private int[] sz;
//	private int count;
//
//	public WeightQuickFindUF(int N) {
//		count = N;
//		id = new int[N];
//		for (int i = 0; i < N; i++) {
//			id[i] = i;
//		}
//		sz = new int[N];
//		for (int i = 0; i < N; i++) {
//			sz[i] = 1;
//		}
//	}
//
//	public int count() {
//		return count;
//	}
//
//	public boolean connected(int p, int q) {
//		return find(p) == find(q);
//	}
//
//	public int find(int p) {
//		while (p != id[p]) {
//			p = id[p];
//		}
//		return p;
//	}
//
//	public void union(int p, int q) {
//		int i = find(p);
//		int j = find(q);
//		if (i == j) {
//			return;
//		}
//		if (sz[i] < sz[j]) {
//			id[i] = j;
//			sz[j] += sz[i];
//		} else {
//			id[j] = i;
//			sz[i] += sz[j];
//		}
//		count--;
//	}
	public static void main(String[] args) throws IOException 
	{
		// Dynamic connectivity problem
		Scanner in = new Scanner(Paths.get("src/Chapter1_5/largeUF.txt"));
		int N = in.nextInt();
		System.out.println(N);
		WeightQuickFindUF uf = new WeightQuickFindUF(N);
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
 * 20.329 seconds    0.056 seconds     0.002 seconds
 * 6 components		  3 components   	2 components
 * */
 