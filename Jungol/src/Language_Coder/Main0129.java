package Language_Coder;
import java.util.Scanner;

public class Main0129 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double b;
		double h;
		char y;
		// String y;
		boolean a = true;
		while (a) {

			System.out.print("Base = ");
			b = sc.nextInt();
			System.out.print("Height = ");
			h = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", b * h / 2);
			System.out.print("Continue? ");
			y = sc.next().charAt(0);
			// y = sc.next();

			if (y == 'y' || y == 'Y') {
				// if (y.equals("y") || y.equals( "Y")) {
				a = true;
			} else
				a = false;
		}
		sc.close();

	}
}
//주석처리 한 부분 작동 확인