package language_coder;
import java.util.Scanner;

public class Main0160 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[6];

		int i, j, k;
		for (i = 0; i < 10; i++) {
			int n = sc.nextInt();
			for (j = 1; j <= 6; j++) {
				if (n == j) {
					ar[j - 1]++;
				}
			}
		}

		for (k = 0; k <= 5; k++) {
			System.out.println(k + 1 + " : " + ar[k]);

		}
		sc.close();
	}
}
