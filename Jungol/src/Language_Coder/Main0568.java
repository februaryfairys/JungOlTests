package Language_Coder;
import java.util.Scanner;

public class Main0568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ar1 = new int[2][4];
		int[][] ar2 = new int[2][4];
		int[][] ar3 = new int[2][4];
		System.out.println("first array");
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}
		System.out.println("second array");
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				ar2[i][j] = sc.nextInt();
				ar3[i][j] = ar1[i][j] * ar2[i][j];
			}
		}

		for (int i = 0; i < ar3.length; i++) {
			for (int j = 0; j < ar3[i].length; j++) {
				System.out.print(ar3[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
