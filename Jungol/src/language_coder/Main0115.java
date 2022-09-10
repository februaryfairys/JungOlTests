package language_coder;
import java.util.Scanner;

public class Main0115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mh = sc.nextInt();
		int mw = sc.nextInt();
		int gh = sc.nextInt();
		int gw = sc.nextInt();

		sc.close();

		boolean a = mh > gh;
		boolean b = mw > gw;

		System.out.print(a && b);
	}

}
