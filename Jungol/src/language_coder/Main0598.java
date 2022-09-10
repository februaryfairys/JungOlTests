package language_coder;
import java.util.Scanner;

public class Main0598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			String a = sc.next();
			char c = a.charAt(0);
			if (c >= 48 && c <= 57) {
				System.out.println((int) c);
			} else if (c >= 97 && c <= 122) {
				System.out.println(c);
			} else if (c >= 65 && c <= 90) {
				System.out.println(c);
			} else {
				sc.close();
				break;
			}
		}

	}

}
