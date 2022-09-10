package language_coder;

public class Main0567 {

	public static void main(String[] args) {
		int[][] ar = { { 5, 8, 10, 6, 4 }, { 11, 20, 1, 13, 2 }, { 7, 9, 14, 22, 3 } };

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%2d   ", ar[i][j]);
			}
			System.out.println();
		}
	}

}
