package language_coder;
import java.util.Scanner;

public class Main0573 {
	static int a;
	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();

		Main0573 mn = new Main0573();
		mn.start(a);
	}

	public void start(int a) {
		num = 1;
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < a; j++) {
//				System.out.print(num++ + " ");
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= a*a; i++) {
			System.out.print(num++ + " ");
			if (i % a == 0)
				System.out.println();
		}
	}
}
