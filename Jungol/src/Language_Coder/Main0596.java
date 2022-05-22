package Language_Coder;
import java.util.Scanner;

public class Main0596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String iStr = sc.next();
		int iNum = sc.nextInt();

		sc.close();

		int strLgt = iStr.length();

		if (iNum > strLgt) {
			for (int i = strLgt-1; i >= 0; i--) {
				System.out.print(iStr.charAt(i));
			}
		} else {
			int subBgn = strLgt - iNum;
			String subStr = iStr.substring(subBgn);

			for (int i = iNum - 1; i >= 0; i--) {
				System.out.print(subStr.charAt(i));
			}
		}
	}
}
