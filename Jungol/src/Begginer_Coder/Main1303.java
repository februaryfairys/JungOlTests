package Begginer_Coder;
import java.util.Scanner;

public class Main1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sero = sc.nextInt();
		int garo = sc.nextInt();
		int i = 1;
		int j = 1;
		sc.close();

		// int num = 1;
		// for (i = 1; i <= sero; i++) {
		// for (j = 1; j <= garo; j++) {
		// System.out.print(j + " ");
		// }

		// System.out.println();

		int num = 1;
		for (i = 0; i < sero; i++) {
			for (j = 0; j < garo; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
