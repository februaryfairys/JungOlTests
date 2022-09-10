package language_coder;
import java.util.Scanner;

public class Main0113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		int w = x + 5;
		int l = 2 * y;

		System.out.println("width = " + w);
		System.out.println("length = " + l);
		System.out.println("area = " + w * l);
	}

}
