package language_coder;
import java.util.Scanner;

public class Main0538 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;

		while (true) {
			System.out.print("number? ");
			a = sc.nextInt();

			if (a > 0) {
				System.out.println("positive integer");

			} else if (a < 0) {
				System.out.println("negative number");
			} else {
				break;

			}

		}
		sc.close();
	}
}
