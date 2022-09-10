package language_coder;
import java.util.Scanner;

public class Main0593 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		for (;;) {
			System.out.print("ASCII code =? ");
			a = sc.nextInt();
			if (a >= 33 || a <= 127) {

			}

			if (a < 33 || a > 127) {
				sc.close();
				break;
			}
			System.out.printf("%c\n", a);
		}

	}

}
