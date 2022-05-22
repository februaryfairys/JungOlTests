package Language_Coder;
import java.util.Scanner;

public class Main0566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] ar = new int[100];

		ar[0] = 100;
		ar[1] = n;

		sc.close();

		System.out.print(ar[0] + " " + ar[1] + " ");

		for (int i = 2; i < ar.length; i++) {
			ar[i] = ar[i - 2] - ar[i - 1];
			System.out.print(ar[i] + " ");
			if (ar[i] < 0) {
				break;
			}

		}
	}
}
