package Language_Coder;
import java.util.Scanner;

public class Main0109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		sc.close();

		System.out.printf("sum = %s\n", (x + y + z));
		System.out.printf("avg = %s", ((x + y + z) / 3));
	}

}
