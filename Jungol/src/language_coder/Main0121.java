package language_coder;
import java.util.Scanner;

public class Main0121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		sc.close();
		if (a == 0) {
			System.out.print("zero");
		} else if (a > 0) {
			System.out.print("plus");
		} else {
			System.out.print("minus");
		}

	}

}
