package language_coder;
import java.util.Scanner;

public class Main0524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		sc.close();

		boolean x = (i != 0);
		boolean y = (j != 0);
		// System.out.println(x);
		// System.out.println(y);

		System.out.println((x && y) + " " + (x || y));
		// System.out.println(x||y);

	}

}
