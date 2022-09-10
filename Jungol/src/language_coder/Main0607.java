package language_coder;

import java.util.Scanner;

public class Main0607 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr1 = sc.next();
		String iStr2 = sc.next();
		sc.close();

		String res = "";
		String strPiece1 = iStr1.substring(0, 2);
		String strPiece2 = iStr2.substring(2);

		res += strPiece1 + strPiece2 + strPiece1;

		System.out.print(res);
	}
}