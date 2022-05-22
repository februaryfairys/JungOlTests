package Language_Coder;
import java.util.Scanner;

public class Main0572 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();

		Main0572 mn = new Main0572();
		double res = mn.width(r);

		System.out.printf("%.2f", res);

	}

	double width(Double r) {
		return r * r * 3.14;

	}

}
