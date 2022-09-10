package language_coder;

public class Main0163 {

	public static void main(String[] args) {
		int[][] ar = { { 3, 5, 9 }, { 2, 11, 5 }, { 8, 30, 10 }, { 22, 5, 1 } };
		int sum = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				sum += ar[i][j];
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print(sum);
	}
}
