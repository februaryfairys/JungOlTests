package Language_Coder;
import java.util.Scanner;

public class Main0178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();
		int res = (int) Math.pow(2, iNum);

		System.out.print(res);
	}
}
