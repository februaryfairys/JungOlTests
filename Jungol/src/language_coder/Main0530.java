package language_coder;
import java.util.Scanner;

public class Main0530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		if (a >= 20) {
			System.out.print("adult");
		} else {
			System.out.print((20 - a) + " years later");
		}
	}
}
