package language_coder;
import java.util.Scanner;

public class Main0532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		sc.close();

		if (a >= 4.0) {
			if (b >= 4.0) {
				System.out.print("A");
			} else if (b >= 3.0) {
				System.out.print("B");
			} else {
				System.out.print("C");
			}
		}

		else if (a >= 3.0) {
			if (b >= 3.0) {
				System.out.print("B");
			} else {
				System.out.print("C");
			}
		}

		else if (a < 3.0) {
			System.out.print("C");
		}
	}
}