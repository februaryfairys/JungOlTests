package language_coder;
import java.util.Scanner;

public class Main0173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0173 mn = new Main_0173();

		int iNum1 = sc.nextInt(), iNum2 = sc.nextInt();
		sc.close();
		
		mn.main_0173(iNum1, iNum2);
	}

}

class Main_0173 {
	public void main_0173(int iNum1, int iNum2) {
		int res = 0;
		int sqrOfiNum1 = iNum1 * iNum1;
		int sqrOfiNum2 = iNum2 * iNum2;

		if (sqrOfiNum1 > sqrOfiNum2) {
			res = sqrOfiNum1 - sqrOfiNum2;
		} else
			res = sqrOfiNum2 - sqrOfiNum1;

		print(res);
	}

	public void print(int res) {
		System.out.println(res);
	}
}
