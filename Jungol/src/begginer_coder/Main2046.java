package begginer_coder;

import java.util.Scanner;

public class Main2046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_2046 mn = new Main_2046();
		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		sc.close();
		mn.input(iNum1, iNum2);
	}
}

class Main_2046 {
	private int num;
	private int numCase;

	public void input(int iNum1, int iNum2) {
		num = iNum1;
		numCase = iNum2;

		switch (numCase) {
		case 1:
			printCase1();
			break;
		case 2:
			printCase2();
			break;
		case 3:
			printCase3();
			break;
		}
	}

	public void printCase1() {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void printCase2() {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= num; j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = num; j >= 1; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	public void printCase3() {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}