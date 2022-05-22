package Language_Coder;
import java.util.Scanner;

public class Main0185 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr1 = sc.next();
		char iStr2 = sc.next().charAt(0);

		sc.close();

		int strLength = iStr1.length();
		char[] ar = new char[strLength];
		boolean c = true;

		for (int i = 0; i < strLength; i++) {
			ar[i] = iStr1.charAt(i);
		}

		for (int j = 0; j < strLength; j++) {
			if (ar[j] == iStr2) {

				System.out.print(j);
				c = true;
				break;
			} else {
				c = false;
			}
		}
		if (c == false) {
			System.out.print("No");
		}
	}

}
