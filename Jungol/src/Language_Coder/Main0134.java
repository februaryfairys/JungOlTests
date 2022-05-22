package Language_Coder;

import java.util.Scanner;

public class Main0134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int odd = 0;
		int even = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] % 2 == 0) {
				even++;
			} else
				odd++;
		}

		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
		sc.close();
	}

}
