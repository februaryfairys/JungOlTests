package language_coder;
import java.util.Scanner;

public class Main0577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = sc.nextInt(), iNum2 = sc.nextInt();
		sc.close();

		Main_0577 mn = new Main_0577();
		mn.main_0577(iNum1, iNum2);
		int res1 = mn.getRes1();
		int res2 = mn.getRes2();

		System.out.print(res1 + " " + res2);
	}
}

class Main_0577 {
	private int res1;
	private int res2;

	public void main_0577(int iNum1, int iNum2) {
		if (iNum1 > iNum2) {
			setRes1(iNum1 / 2);
			setRes2(iNum2 * 2);
		} else if (iNum2 > iNum1) {
			setRes1(iNum1 * 2);
			setRes2(iNum2 / 2);
		} else {
			setRes1(iNum1 * 2);
			setRes2(iNum2 / 2);
		}
	}

	public int getRes1() {
		return res1;
	}

	public void setRes1(int res1) {
		this.res1 = res1;
	}

	public int getRes2() {
		return res2;
	}

	public void setRes2(int res2) {
		this.res2 = res2;
	}
}
