package Language_Coder;
import java.util.Scanner;

public class Main0184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.nextLine();
		String str = "";

		sc.close();

		int strLength = iStr.length();

		for (int i = 0; i < strLength; i++) {
			char tmp = iStr.charAt(i);

			if (Character.isAlphabetic(tmp)) {
				str += tmp;
			} else if (tmp >= 48 && tmp <= 57) {
				str += tmp;
			}
		}

		String res = str.toLowerCase();
		System.out.print(res);
	}

}
