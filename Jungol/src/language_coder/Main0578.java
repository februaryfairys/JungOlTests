package language_coder;
import java.util.Scanner;

public class Main0578 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = sc.nextInt(), iNum2 = sc.nextInt();
		int bigNum, smlNum;
		sc.close();

		if (iNum1 > iNum2) {
			bigNum = iNum1;
			smlNum = iNum2;
		} else {
			bigNum = iNum2;
			smlNum = iNum1;
		}

		Main_0578 mn = new Main_0578();
		mn.main_0578(bigNum, smlNum);
	}

}

class Main_0578 {
	public void main_0578(int bigNum, int smlNum) {
		print(bigNum, smlNum);
	}

	public void print(int bigNum, int smlNum) {
		for (int i = smlNum; i <= bigNum; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
