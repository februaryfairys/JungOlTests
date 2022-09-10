package language_coder;
import java.util.Scanner;

public class Main0177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int iNum = sc.nextInt();
			int abs = Math.abs(iNum);
			sum += abs;
		}
		sc.close();
		System.out.print(sum);

	}
}
