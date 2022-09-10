package language_coder;
import java.util.Scanner;

public class Main0124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int res = 0;
		if (a == 2) {
			res = 28;
		} else if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			res = 31;
		} else {
			res = 30;
		}
		System.out.print(res);

	}

}
