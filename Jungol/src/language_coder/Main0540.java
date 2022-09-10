package language_coder;
import java.util.Scanner;

public class Main0540 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			int i = sc.nextInt();
			if (i == -1) {
				break;
			} else if (i % 3 == 0) {

				System.out.println(i / 3);
			}

		} while (true);
		sc.close();

	}
}
