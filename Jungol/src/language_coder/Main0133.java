package language_coder;
import java.util.Scanner;

public class Main0133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] ar = new int[a];
		int sum = 0;

		for (int i = 0; i < a; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		System.out.printf("%.2f", (double) sum / (double) ar.length);
		sc.close();
	}
}
