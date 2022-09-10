package language_coder;
import java.util.Scanner;

public class Main0187 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.next();
		String res = "";

		for (;;) {
			int iNum = sc.nextInt();

			if (iNum >= iStr.length()) {
				res = iStr.substring(0, iStr.length() - 1);
				iStr = res;
				System.out.println(res);
			} else {
				res = iStr.substring(0, iNum - 1) + iStr.substring(iNum);
				iStr = res;
				System.out.println(res);
			}

			if (res.length() == 1) {
				sc.close();
				break;
			}
		}
	}
}
