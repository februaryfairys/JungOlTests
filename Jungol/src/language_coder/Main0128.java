package language_coder;
import java.util.Scanner;

public class Main0128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		while (true) {
			int a = sc.nextInt();

			if ((double) a % 3 != 0) {
				if ((double) a % 5 != 0)
					cnt = cnt + 1;
			}

			if (a == 0)
				break;

		}

		System.out.print(cnt);
		sc.close();
	}

}
