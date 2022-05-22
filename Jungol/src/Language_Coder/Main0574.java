package Language_Coder;

import java.util.Scanner;

public class Main0574 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0574 mn = new Main_0574();

		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		int iNum3 = sc.nextInt();

		int max = mn.getMax(iNum1, iNum2, iNum3);

		System.out.print(max);

		sc.close();
	}
}

class Main_0574 {

	public int getMax(int a, int b, int c) {
		int max;
		max = a >= b ? a : b;
		max = max >= c ? max : c;
		return max;
	}
}
