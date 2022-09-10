package language_coder;
import java.util.Scanner;

public class Main0162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] ar = new int[10];
		ar[0] = m;
		ar[1] = n;
		sc.close();

		for (int i = 2; i < ar.length; i++) {
			int x = (ar[i - 2] + ar[i - 1]) % 10;
			ar[i] = x;
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
	}
}
