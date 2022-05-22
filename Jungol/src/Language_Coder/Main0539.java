package Language_Coder;
import java.util.Scanner;

public class Main0539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int i = 0;
		while (true) {
			a = sc.nextInt();
			i++;
			sum += a;

			if (a >= 100) {

				break;
			}

		}
		System.out.println(sum);
		System.out.printf("%.1f", (double) sum / i);
		sc.close();
	}
}
