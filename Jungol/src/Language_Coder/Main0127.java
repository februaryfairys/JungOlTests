package Language_Coder;
import java.util.Scanner;

public class Main0127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		int dev = 0;

		while (true) {

			i = sc.nextInt();

			if (i >= 0 && i <= 100) {
				sum = sum + i;
				dev = dev + 1;
			}

			if (i < 0 || i > 100)
				break;
		}

		double res = (double) sum / (double) dev;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", res);
		sc.close();
	}
}