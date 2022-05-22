package Language_Coder;
import java.util.Scanner;

public class Main0525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		boolean a = (x > y && x > z);
		boolean b = (x == y && y == x);

		System.out.print(a + " " + b);

	}

}
