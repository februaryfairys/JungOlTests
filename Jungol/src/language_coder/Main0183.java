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
				System.out.println("5�� �̻� 100�� ������ ���ڿ��� �Է��ϼ���.");
			} else {
				System.out.print(res);
				sc.close();
				break;
			}
		}
	}
}
