package language_coder;
import java.util.Scanner;

public class Main0183 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			String iStr = sc.next();
			String res = iStr.substring(0, 5);
			int iStrLength = iStr.length();

			if (iStrLength < 5 || iStrLength > 100) {
				System.out.println("5자 이상 100자 이하의 문자열을 입력하세요.");
			} else {
				System.out.print(res);
				sc.close();
				break;
			}
		}
	}
}
