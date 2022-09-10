package begginer_coder;
import java.util.Scanner;

public class Main1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.close();

		int num = 0;
		int[][] ar = new int[n][m];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					ar[i][j] = ++num;
				}
			} else {

				for (int j = m - 1; j >= 0; j--) {
					ar[i][j] = ++num;
				}

			}

		}
		for (int[] x : ar) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
