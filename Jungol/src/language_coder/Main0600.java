package language_coder;

import java.util.Scanner;

public class Main0600 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String iStr = sc.nextLine();
		sc.close();

		int strLength = iStr.length();
		int blkCnt = 1;
		char blk = ' ';

		for (int i = 0; i < strLength; i++) {
			char blkChker = iStr.charAt(i);
			if (blkChker == blk) {
				blkCnt += 1;
			}
		}
		System.out.print(blkCnt);
	}
}