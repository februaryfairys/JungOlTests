package language_coder;
import java.util.Scanner;

public class Main0174 {

	public static void main(String[] args) {

		Main_0174 mn = new Main_0174();
		mn.main0174();
	}
}

class Main_0174 {
	public void main0174() {
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[4][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ar[i][j] = sc.nextInt();
				ar[i][3] += ar[i][j];
			}
			for (int k = 0; k < 4; k++) {
				ar[3][k] += ar[i][k];
			}
		}
		sc.close();
		
		for (int i = 0; i < ar[3].length; i++) {
			for (int j = 0; j < ar[3].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}