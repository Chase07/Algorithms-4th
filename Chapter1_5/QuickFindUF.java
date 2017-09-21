package Chapter1_5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Stopwatch;

public class QuickFindUF {

	private int[] id;// id for accessing to components(site index)
	private int count;// number of components
	
	public QuickFindUF(int N)
	{
		//Initialize component id array
		count  = N;
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	
	}
	public int count() { return count; }
	public boolean connected(int p, int q)
	{
		return find(p) == find(q);
	}
	public int find(int p)
	{
		return id[p];
	}
	public void union(int p, int q)
	{
		int pID = find(p);
		int qID = find(q);
		
		if(pID == qID)
		{
			return;
		}
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pID) { id[i] = qID; }
		}
		--count;
	}
	public static void main(String[] args) throws IOException 
	{
		// Dynamic connectivity problem
		Scanner in = new Scanner(Paths.get("src/Chapter1_5/tinyUF.txt"));
		int N = in.nextInt();
		System.out.println(N);
		UF uf = new UF(N);
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
/* largeUF.txt        mediumUF.txt      tinyUF.txt
 * N = 1000000        N = 625			N = 10
 * 791.378 seconds    0.054 seconds     0.002 seconds
 * 6 components		  3 components   	2 components
 * */


