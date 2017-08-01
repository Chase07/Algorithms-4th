package Chapter1_1;

public class Exercise_12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = 9 - i;
		}
		for (int i = 0; i < 10; i++) {
			a[i] = a[a[i]];
			
		}
		// emmmm... it's boring
		/*for (int i = 0; i < 10; i++) {
			System.out.println(i);// 0 ... 9
		}*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);// 0 1 2 3 4 4 3 2 1 0
		}
	}

}
