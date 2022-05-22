package Language_Coder;
import java.util.Scanner;

public class Main0531 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();

		sc.close();

		if (88.45 < a) {
			System.out.print("Heavyweight");
		} else if (72.57 < a) {
			System.out.print("Cruiserweight");
		} else if (61.23 < a ) {
			System.out.print("Middleweight");
		} else if (50.80 < a) {
			System.out.print("Lightweight");
		} else if (a <= 50.80) {
			System.out.print("Flyweight");
		}

	}

}
