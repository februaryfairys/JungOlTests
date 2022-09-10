package language_coder;
import java.util.Scanner;

public class Main0126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int odd = 0;
		int even = 0;

		while (true) {
			a = sc.nextInt();

			if (a == 0) {
				break;
			} else if (a % 2 == 0) {
				even++;

			} else if (a % 2 != 0) {
				odd++;
			}

		}

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

		sc.close();
	}

}
