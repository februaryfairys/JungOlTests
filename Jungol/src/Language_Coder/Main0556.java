package Language_Coder;

public class Main0556 {

	public static void main(String[] args) {

	/*	int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " "); */
		
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			;
		}
	}

}
