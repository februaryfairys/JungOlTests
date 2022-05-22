package Language_Coder;
import java.util.Scanner;

public class Main0168 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ar = new int[n][n];
		ar[0][0] = 1;
		sc.close();

		for (int i = 1; i < n; i++) {
			ar[i][0] = 1;
			for (int j = 1; j < n; j++) {
				ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j];
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (ar[i][j] != 0) {
					System.out.print(ar[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
