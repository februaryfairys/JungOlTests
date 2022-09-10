package language_coder;
import java.util.Scanner;

public class Main0167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] ar = new int[4][2];
		
		int hSum0 = 0, hSum1 = 0, hSum2 = 0, hSum3 = 0;
		int vSum0 = 0, vSum1 = 0, Sum = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			hSum0 += ar[0][i];
			hSum1 += ar[1][i];
			hSum2 += ar[2][i];
			hSum3 += ar[3][i];
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				Sum += ar[i][j];
			}
			vSum0 += ar[i][0];
			vSum1 += ar[i][1];
		}
		
		int hAvg0 = hSum0 / 2, hAvg1 = hSum1 / 2, hAvg2 = hSum2 / 2, hAvg3 = hSum3 / 2;
		int vAvg0 = vSum0 / 4, vAvg1 = vSum1 / 4, Avg = Sum / 8;

		System.out.printf("%d %d %d %d\n", hAvg0, hAvg1, hAvg2, hAvg3);
		System.out.printf("%d %d\n", vAvg0, vAvg1);
		System.out.printf("%d\n", Avg);
		sc.close();
	}

}
