package language_coder;
import java.util.Scanner;

public class Main0535 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();

		sc.close();

		if (a >= 0 && a <= 4.5) {
			switch ((int) a) {
			case 4:
				System.out.print("scholarship");
				break;
			case 3:
				System.out.print("next semester");
				break;
			case 2:
				System.out.print("seasonal semester");
				break;
			default:
				System.out.print("retake");
				break;
			}
		}
	}
}
