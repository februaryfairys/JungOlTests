package Language_Coder;
import java.util.Scanner;

public class Main0166 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] ar1 = new int[2][3];
		int[][] ar2 = new int[2][3];
		int[][] ar3 = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}
	
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				ar3[i][j] = ar1[i][j] * ar2[i][j];
			}
		}
		System.out.println("first array");
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ar3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
