package Language_Coder;
import java.util.Scanner;

public class Main0559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int i = sc.nextInt();
		int j = sc.nextInt();

		sc.close();

		System.out.println(a[i - 1] + a[j - 1]);
	}

}
