package language_coder;
import java.util.Scanner;

public class Main0565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (;;) {
			int n = sc.nextInt();
			int a = n / 10;

			if (n == 0) {
				sc.close();
				break;

			}

			for (int i = 0; i < ar.length; i++) {
				if (a == i) {
					ar[i]++;
				}

			}

		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.println(i + " : " + ar[i]);

			}
		}

	}

}
