package begginer_coder;

import java.util.Scanner;

public class Main1291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;

		while (true) {
			i = sc.nextInt();
			j = sc.nextInt();
			if (i > 9 || j > 9 || i < 2 || j < 2) {
				System.out.println("INPUT ERROR!");
			} 

			else {
				if (i < j) {
					for (int b = 1; b <= 9; b++) {

						for (int a = i; a <= j; a++) {
							System.out.printf("%d * %d = %2d   ", a, b, (a * b));
						}
						System.out.println();
						
					} break;
				} else {
					for (int b = 1; b <= 9; b++) {

						for (int a = i; a >= j; a--) {
							System.out.printf("%d * %d = %2d   ", a, b, (a * b));
						}
						System.out.println();
						
					}break;
				}
			}
		} sc.close();
	}
}