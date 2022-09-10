package language_coder;
import java.util.Scanner;

public class Main0516 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String A = sc.next();
		// char B = sc.next().charAt(0);

		sc.close();

		System.out.printf("%.2f\n", a);
		System.out.printf("%.2f\n", b);
		System.out.println(A);
	}

}
