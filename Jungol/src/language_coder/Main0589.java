package language_coder;
import java.util.Scanner;

public class Main0589 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();
		int sum = 0;
		
		res(iNum, sum);
		
	}

	public static void res(int iNum, int sum) {
		if (iNum == 0) {
			System.out.print(sum);
			return;
		} else {
			res(iNum - 1, sum + iNum);
		}
	}
}
