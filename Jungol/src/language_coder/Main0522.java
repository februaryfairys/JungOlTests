package language_coder;
import java.util.Scanner;

public class Main0522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

		if (i == j) {
			System.out.println("true");
		} else
			System.out.println("false");
		if (i != j) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
