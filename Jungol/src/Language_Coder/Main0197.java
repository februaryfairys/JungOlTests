package Language_Coder;

import java.util.Scanner;

public class Main0197 {

	public static void main(String[] args) {
		Main_0197 mn = new Main_0197();
		mn.input();
	}
}

class Main_0197 {

	public void input() {
		Scanner sc = new Scanner(System.in);
		int[] ar1 = new int[4];
		int[] ar2 = new int[4];
		int iNum;

		for (int i = 0; i < ar1.length + ar2.length; i++) {
			iNum = sc.nextInt();
			if (i < 4) {
				ar1[i] = iNum;
			} else {
				int j = i - 4;
				ar2[j] = iNum;
			}
		}
		result(ar1, ar2);
		sc.close();
	}

	public void result(int[] ar1, int[] ar2) {
		int[] arResult = new int[4];
		boolean checkInputError = true;

		for (int i = 0; i < ar1.length; i++) {
			if (i < 2) {
				if (ar1[i] <= ar2[i]) {
					arResult[i] = ar1[i];
				} else
					arResult[i] = ar2[i];
			} else {
				if (ar1[i] >= ar2[i]) {
					arResult[i] = ar1[i];
				} else
					arResult[i] = ar2[i];
			}
		}
		
		for (int i = 0; i < arResult.length; i++) {
			if (arResult[i] > 100) {
				checkInputError = false;
			}
		}

		if (checkInputError == true) {
			print(arResult);
		} else
			printError();
	}

	public void print(int[] arResult) {
		for (int i = 0; i < arResult.length; i++) {
			System.out.print(arResult[i] + " ");
		}
	}

	public void printError() {
		System.out.println("100 이하의 숫자들만 입력해주세요.");
		input();

	}
}
