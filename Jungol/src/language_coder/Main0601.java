package language_coder;

import java.util.Scanner;

public class Main0601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.next();
		sc.close();
		
		int strLength = iStr.length();

		for (int i = 1; i <= strLength; i++) {
			String iStrSub1 = iStr.substring(strLength - i);
			String iStrSub2 = iStr.substring(0, strLength - i);
			System.out.println(iStrSub1 + iStrSub2);
		}
	}
}