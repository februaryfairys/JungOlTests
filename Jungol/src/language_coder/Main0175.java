package language_coder;
import java.util.Arrays;
import java.util.Scanner;

public class Main0175 {

	public static void main(String[] args) {
		Main_0175 mn = new Main_0175();
		mn.start();
	}

}

class Main_0175 {
	public void start() {
		input();
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		int[] numAr = new int[iNum];
		for (int i = 0; i < iNum; i++) {
			numAr[i] = sc.nextInt();
		}
		sc.close();
		sort(numAr);
	}

	public void sort(int[] ar) {
		Arrays.sort(ar);
		output(ar);
	}

	public void output(int[] ar) {
		String res = "";
		for (int i = ar.length - 1; i >= 0; i--) {
			res += ar[i] + " ";
		}
		System.out.print(res);
	}
}