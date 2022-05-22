package Language_Coder;
import java.util.Scanner;

public class Main0116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			sum = sum + ar[i];
		}

		System.out.printf("%.1f", sum / ar.length);
		sc.close();
	}
}
