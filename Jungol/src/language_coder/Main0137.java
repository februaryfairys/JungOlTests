package language_coder;
import java.util.Scanner;

public class Main0137 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= b; i++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
			sc.close();
		}
	}
}
