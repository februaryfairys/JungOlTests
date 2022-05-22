package Language_Coder;
import java.util.Scanner;

public class Main0604 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ar = new String[10];
		String res = "";

		for (int i = 0; i < ar.length; i++) {
			String iStr = sc.next();
			ar[i] = iStr;
		}

		String spl = sc.next();

		for (int i = 0; i < ar.length; i++) {
			int filter = ar[i].length() - 1;
			String tmp = ar[i].substring(filter);
			if (spl.equals(tmp)) {
				res += ar[i] + "\n";
			}
		}
		sc.close();
		System.out.print(res);
	}
}
