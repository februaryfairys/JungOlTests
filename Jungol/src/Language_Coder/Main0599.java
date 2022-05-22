package Language_Coder;

import java.util.Scanner;

public class Main0599 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.next();
		String str = "";
		
		sc.close();

		int iStrLength = iStr.length();
		
		for (int i = 0; i < iStrLength; i++) {
			char iStrChar = iStr.charAt(i);

			if (iStrChar >= 65 && iStrChar <= 90) {
				str += iStrChar;
			} else if (iStrChar >= 97 && iStrChar <= 122) {
				str += iStrChar;
			}
		}
		
		String res = str.toUpperCase();
		System.out.println(res);
	}

}
