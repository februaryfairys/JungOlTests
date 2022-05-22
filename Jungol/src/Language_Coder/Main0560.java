package Language_Coder;
import java.util.Scanner;

public class Main0560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int min = 1000;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			// min = (ar[0] < ar[i] ? ar[0] : ar[i]);
			min = (min < ar[i] ? min : ar[i]);
			// System.out.println(ar[i]);
		}
		System.out.print(min);
		sc.close();
		// for (int j = 1; j < ar.length; j++) {
		// min = (ar[0] < ar[j] ? ar[0] : ar[j]);
		// min2 = ((ar[0]) < min) ? ar[0] : min2;
		// }
		// System.out.print(min);
	}
}
