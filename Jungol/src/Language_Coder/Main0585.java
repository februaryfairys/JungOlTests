package Language_Coder;

import java.util.Scanner;

public class Main0585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int j = 0; j < ar.length - 1; j++) {
			for (int k = 0; k < ar.length - 1; k++) {
				int a = k + 1;
				if (ar[a] > ar[k]) {
					int tmp = ar[k];
					ar[k] = ar[a];
					ar[a] = tmp;
				}
				System.out.print(ar[k] + " ");
			}
			System.out.print(ar[9]);
			System.out.println();
		}
	}
}
