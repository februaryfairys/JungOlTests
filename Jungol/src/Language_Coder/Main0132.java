package Language_Coder;
import java.util.Scanner;

public class Main0132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {

			if (i % 5 == 0) {
				sum += i;
			}

		}
		System.out.print(sum);

	}

}
