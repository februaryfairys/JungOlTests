package language_coder;
import java.util.Scanner;

public class Main0123 {

	public static void main(String[] args) {

		System.out.print("Number? ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	//	int a = 0;
		String[] b = { "dog", "cat", "chick" };
		sc.close();
		switch (a) {
	//	a = sc.nextInt();
		case 1:
			System.out.println(b[a - 1]);
			break;
		case 2:
			System.out.println(b[a - 1]);
			break;
		case 3:
			System.out.println(b[a - 1]);
			break;
		default:
			System.out.println("I don't know.");
			break;
		}

		if (a == 1) {
			System.out.println(b[0]);
		} else if (a == 2) {
			System.out.println(b[1]);
		} else if (a == 3) {
			System.out.println(b[2]);
		} else
			System.out.print("I don't know.");
	}
}
