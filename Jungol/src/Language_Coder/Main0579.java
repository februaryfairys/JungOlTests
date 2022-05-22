package Language_Coder;

import java.util.Scanner;

public class Main0579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0579 mn = new Main_0579();
		int iNum = sc.nextInt();
		int[] ar = new int[iNum];

		for (int i = 0; i < iNum; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		mn.sort(ar);
	}

}

class Main_0579 {
	public void sort(int[] ar) {
		int tmp;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}

		for (int num : ar) {
			System.out.print(num + " ");
		}
	}
}
