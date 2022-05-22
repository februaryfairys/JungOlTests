package Language_Coder;
import java.util.Scanner;

public class Main0588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();
		print(iNum);

	}

	public static void print(int iNum) {
		if (iNum == 0) {
			return;
		} else {
			System.out.print(iNum + " ");
			print(iNum - 1);
		}
	}
}
