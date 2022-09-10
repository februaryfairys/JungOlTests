package language_coder;
import java.util.Scanner;

public class Main0164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar0 = new int[3], ar1 = new int[3], ar2 = new int[3], ar3 = new int[3];
		int[] sum = new int[4];

		for (int i = 0; i < ar1.length; i++) {
			ar0[i] = sc.nextInt();
			sum[0] += ar0[i];
		}
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = sc.nextInt();
			sum[1] += ar1[i];
		}
		for (int i = 0; i < ar1.length; i++) {
			ar2[i] = sc.nextInt();
			sum[2] += ar2[i];
		}
		for (int i = 0; i < ar1.length; i++) {
			ar3[i] = sc.nextInt();
			sum[3] += ar3[i];
		}
		System.out.print("1class? 2class? 3class? 4class? ");
		for (int i = 0; i < sum.length; i++) {
			int numberOfClass = i + 1;
			System.out.println(numberOfClass + "class : " + sum[i]);
		}
		sc.close();
	}
}
