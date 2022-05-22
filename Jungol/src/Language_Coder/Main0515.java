package Language_Coder;
import java.util.Scanner;

public class Main0515 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		sc.close();

		System.out.printf("%d * %d = %d\n", i, j, (i * j));
		System.out.printf("%d / %d = %d", i, j, (i / j));

	}

}
