package Language_Coder;
import java.util.Scanner;

public class Main0569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] ar1 = new int[5][4];
		int[] ar2 = new int[5];
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				ar2[i] += ar1[i][j];
			}
			if (ar2[i] / 4 >= 80) {
				System.out.println("pass");
				cnt++;
			} else
				System.out.println("fail");
		}
		System.out.print("Successful : " + cnt);
		sc.close();
	}

}
